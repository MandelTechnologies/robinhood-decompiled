package defpackage;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.Drop2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import operation.StandardLogicOperation;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: Drop.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J2\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002J \u0010\r\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u0010\u001a\u00020\t*\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0012"}, m3636d2 = {"LDrop;", "Loperation/StandardLogicOperation;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "modeBasedDrop", "mode", "LDropMode;", "first", "Lkotlin/Function0;", "last", "dropElements", "count", "", "toDropMode", "", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class Drop implements StandardLogicOperation {
    public static final Drop INSTANCE = new Drop();

    private Drop() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        List<Object> asList = AnyUtils.getAsList(expression);
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) asList);
        Object objSecondOrNull = ListUtils3.secondOrNull(asList);
        Drop drop = INSTANCE;
        Object objThirdOrNull = ListUtils3.thirdOrNull(asList);
        Drop2 dropMode = drop.toDropMode(objThirdOrNull instanceof String ? (String) objThirdOrNull : null);
        Integer num = objSecondOrNull instanceof Integer ? (Integer) objSecondOrNull : null;
        if (num != null) {
            return drop.dropElements(objFirstOrNull, num.intValue(), dropMode);
        }
        return null;
    }

    private final Drop2 toDropMode(String str) {
        return Intrinsics.areEqual(str, "first") ? Drop2.First.INSTANCE : Intrinsics.areEqual(str, "last") ? Drop2.Last.INSTANCE : Drop2.Unknown.INSTANCE;
    }

    private final Object dropElements(final Object obj, final int i, Drop2 drop2) {
        if (obj instanceof String) {
            return modeBasedDrop(drop2, new Function0<Object>() { // from class: Drop.dropElements.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StringsKt.drop((String) obj, i);
                }
            }, new Function0<Object>() { // from class: Drop.dropElements.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StringsKt.dropLast((String) obj, i);
                }
            });
        }
        if (obj instanceof List) {
            return modeBasedDrop(drop2, new Function0<Object>() { // from class: Drop.dropElements.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CollectionsKt.drop((Iterable) obj, i);
                }
            }, new Function0<Object>() { // from class: Drop.dropElements.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CollectionsKt.dropLast((List) obj, i);
                }
            });
        }
        return null;
    }

    private final Object modeBasedDrop(Drop2 mode, Function0<? extends Object> first, Function0<? extends Object> last) {
        if (Intrinsics.areEqual(mode, Drop2.First.INSTANCE)) {
            return first.invoke();
        }
        if (Intrinsics.areEqual(mode, Drop2.Last.INSTANCE)) {
            return last.invoke();
        }
        if (Intrinsics.areEqual(mode, Drop2.Unknown.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
