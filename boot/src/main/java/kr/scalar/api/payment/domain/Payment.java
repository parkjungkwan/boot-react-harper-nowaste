package kr.scalar.api.payment.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import kr.scalar.api.board.domain.Board;
import kr.scalar.api.cart.domain.Cart;
import kr.scalar.api.product.domain.Product;
import kr.scalar.api.receiver.domain.Receiver;
import kr.scalar.api.user.domain.UserVo;
import lombok.Getter;

@Entity @Getter @Table(name="payments")
public class Payment {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="pay_no") private long payNo;
   @Column(name="pay_price") private String payPrice;
   @Column(name="pay_amount") private long payAmount;
   @Column(name="dvr_fee") private String dvrFee;
   @Column(name="pay_date") private String payDate;
   @Column(name="pay_state") private String payState;
   
   @ManyToOne
   @JoinColumn(name="usr_no")
   private UserVo userVo;
   
   @ManyToOne
   @JoinColumn(name="prd_no")
   private Product product;
   
   @OneToMany(mappedBy="payment")
   private List<Receiver> receivers = new ArrayList<>();
   
   @OneToMany(mappedBy="payment")
   private List<Board> boards = new ArrayList<>();
   
   @OneToOne(mappedBy="payment")
   private Cart cart;
   
}