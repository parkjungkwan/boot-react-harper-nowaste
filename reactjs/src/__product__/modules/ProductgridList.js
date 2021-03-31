import PropTypes from "prop-types"
import React, { Fragment } from "react"
import { connect } from "react-redux"
import { addToCart } from "../../aaaredux/actions/cartActions"
import { addToWishlist } from "../../aaaredux/actions/wishlistActions"
import { addToCompare } from "../../aaaredux/actions/compareActions"
import ProductGridListSingle from "./ProductGridListSingle"

const ProductGridList = ({
  products,
  currency,
  addToCart,
  addToWishlist,
  addToCompare,
  cartItems,
  wishlistItems,
  compareItems,
  sliderClassName,
  spaceBottomClass
}) => {
  return (
    <Fragment>
      {products.map(product => {
        return (
          <ProductGridListSingle
            sliderClassName={sliderClassName}
            spaceBottomClass={spaceBottomClass}
            product={product}
            currency={currency}
            addToCart={addToCart}
            addToWishlist={addToWishlist}
            addToCompare={addToCompare}
            cartItem={
              cartItems.filter(cartItem => cartItem.id === product.prdNo)[0]
            }
            wishlistItem={
              wishlistItems.filter(
                wishlistItem => wishlistItem.id === product.prdNo
              )[0]
            }
            compareItem={
              compareItems.filter(
                compareItem => compareItem.id === product.prdNo
              )[0]
            }
            key={product.prdNo}
          />
        )
      })}
    </Fragment>
  )
}

ProductGridList.propTypes = {
  addToCart: PropTypes.func,
  addToCompare: PropTypes.func,
  addToWishlist: PropTypes.func,
  cartItems: PropTypes.array,
  compareItems: PropTypes.array,
  currency: PropTypes.object,
  products: PropTypes.array,
  sliderClassName: PropTypes.string,
  spaceBottomClass: PropTypes.string,
  wishlistItems: PropTypes.array
}

const mapStateToProps = state => {
  return {
    currency: state.currencyData,
    cartItems: state.cartData,
    wishlistItems: state.wishlistData,
    compareItems: state.compareData
  }
}

const mapDispatchToProps = dispatch => {
  return {
    addToCart: (
      item,
      addToast,
      quantityCount,
      selectedProductColor,
      selectedProductSize
    ) => {
      dispatch(
        addToCart(
          item,
          addToast,
          quantityCount,
          selectedProductColor,
          selectedProductSize
        )
      )
    },
    addToWishlist: (item, addToast) => {
      dispatch(addToWishlist(item, addToast))
    },
    addToCompare: (item, addToast) => {
      dispatch(addToCompare(item, addToast))
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(ProductGridList)