package kr.scalar.api.category.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategory is a Querydsl query type for Category
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCategory extends EntityPathBase<Category> {

    private static final long serialVersionUID = 177771815L;

    public static final QCategory category = new QCategory("category");

    public final StringPath ctgName = createString("ctgName");

    public final NumberPath<Long> ctgNo = createNumber("ctgNo", Long.class);

    public final ListPath<kr.scalar.api.product.domain.Product, kr.scalar.api.product.domain.QProduct> products = this.<kr.scalar.api.product.domain.Product, kr.scalar.api.product.domain.QProduct>createList("products", kr.scalar.api.product.domain.Product.class, kr.scalar.api.product.domain.QProduct.class, PathInits.DIRECT2);

    public QCategory(String variable) {
        super(Category.class, forVariable(variable));
    }

    public QCategory(Path<? extends Category> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCategory(PathMetadata metadata) {
        super(Category.class, metadata);
    }

}

