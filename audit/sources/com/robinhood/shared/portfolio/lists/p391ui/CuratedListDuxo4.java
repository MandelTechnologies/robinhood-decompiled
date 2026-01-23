package com.robinhood.shared.portfolio.lists.p391ui;

import android.content.Context;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellHelper;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.EquityOrderSide;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CuratedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onWatchListItemBuy$2", m3645f = "CuratedListDuxo.kt", m3646l = {356}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onWatchListItemBuy$2, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ Context $context;
    final /* synthetic */ CuratedListItem $curatedListItem;
    final /* synthetic */ Function1<String, Unit> $onShowError;
    int label;
    final /* synthetic */ CuratedListDuxo this$0;

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onWatchListItemBuy$2$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CuratedListSource.values().length];
            try {
                iArr[CuratedListSource.WATCHLIST_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CuratedListDuxo4(CuratedListDuxo curatedListDuxo, CuratedListItem curatedListItem, String str, Context context, Function1<? super String, Unit> function1, Continuation<? super CuratedListDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = curatedListDuxo;
        this.$curatedListItem = curatedListItem;
        this.$accountNumber = str;
        this.$context = context;
        this.$onShowError = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CuratedListDuxo4(this.this$0, this.$curatedListItem, this.$accountNumber, this.$context, this.$onShowError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CuratedListDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, com.robinhood.android.trading.contracts.EquityOrderFlowSource] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objFirst;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<BuySellData> buySellData = this.this$0.buySellStore.getBuySellData(this.$curatedListItem.getId(), this.$accountNumber);
            this.label = 1;
            objFirst = FlowKt.first(buySellData, this);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objFirst = obj;
        }
        BuySellData buySellData2 = (BuySellData) objFirst;
        if (buySellData2 != null ? buySellData2.getIsBuyToOpenEnabled() : false) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = EquityOrderFlowSource.WATCHLIST_ROW;
            this.this$0.withDataState(new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onWatchListItemBuy$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CuratedListDuxo4.invokeSuspend$lambda$0(objectRef, (CuratedListDataState) obj2);
                }
            });
            Navigator.DefaultImpls.startActivity$default(this.this$0.navigator, this.$context, new EquityOrderActivityIntentKey.WithId(this.$curatedListItem.getId(), EquityOrderSide.BUY, (EquityOrderFlowSource) objectRef.element, null, null, null, null, false, false, 504, null), null, false, null, null, 60, null);
        } else {
            this.$onShowError.invoke(buySellData2 != null ? BuySellHelper.INSTANCE.getTradabilityError(this.$context, buySellData2, CuratedListViewState2.isSubzeroMember(this.this$0.getStateFlow().getValue()), CuratedListViewState2.isInEtfSupportedRegion(this.this$0.getStateFlow().getValue())) : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invokeSuspend$lambda$0(Ref.ObjectRef objectRef, CuratedListDataState curatedListDataState) {
        T t;
        if (WhenMappings.$EnumSwitchMapping$0[curatedListDataState.getSource().ordinal()] == 1) {
            t = EquityOrderFlowSource.WATCHLIST_TAB;
        } else {
            t = EquityOrderFlowSource.WATCHLIST_ROW;
        }
        objectRef.element = t;
        return Unit.INSTANCE;
    }
}
