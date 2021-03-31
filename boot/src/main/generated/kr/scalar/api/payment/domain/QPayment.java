package kr.scalar.api.payment.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPayment is a Querydsl query type for Payment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPayment extends EntityPathBase<Payment> {

    private static final long serialVersionUID = -1915070861L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPayment payment = new QPayment("payment");

    public final ListPath<kr.scalar.api.board.domain.Board, kr.scalar.api.board.domain.QBoard> boards = this.<kr.scalar.api.board.domain.Board, kr.scalar.api.board.domain.QBoard>createList("boards", kr.scalar.api.board.domain.Board.class, kr.scalar.api.board.domain.QBoard.class, PathInits.DIRECT2);

    public final kr.scalar.api.cart.domain.QCart cart;

    public final StringPath dvrFee = createString("dvrFee");

    public final NumberPath<Long> payAmount = createNumber("payAmount", Long.class);

    public final StringPath payDate = createString("payDate");

    public final NumberPath<Long> payNo = createNumber("payNo", Long.class);

    public final StringPath payPrice = createString("payPrice");

    public final StringPath payState = createString("payState");

    public final kr.scalar.api.product.domain.QProduct product;

    public final ListPath<kr.scalar.api.receiver.domain.Receiver, kr.scalar.api.receiver.domain.QReceiver> receivers = this.<kr.scalar.api.receiver.domain.Receiver, kr.scalar.api.receiver.domain.QReceiver>createList("receivers", kr.scalar.api.receiver.domain.Receiver.class, kr.scalar.api.receiver.domain.QReceiver.class, PathInits.DIRECT2);

    public final kr.scalar.api.user.domain.QUserVo userVo;

    public QPayment(String variable) {
        this(Payment.class, forVariable(variable), INITS);
    }

    public QPayment(Path<? extends Payment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPayment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPayment(PathMetadata metadata, PathInits inits) {
        this(Payment.class, metadata, inits);
    }

    public QPayment(Class<? extends Payment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cart = inits.isInitialized("cart") ? new kr.scalar.api.cart.domain.QCart(forProperty("cart"), inits.get("cart")) : null;
        this.product = inits.isInitialized("product") ? new kr.scalar.api.product.domain.QProduct(forProperty("product"), inits.get("product")) : null;
        this.userVo = inits.isInitialized("userVo") ? new kr.scalar.api.user.domain.QUserVo(forProperty("userVo"), inits.get("userVo")) : null;
    }

}

