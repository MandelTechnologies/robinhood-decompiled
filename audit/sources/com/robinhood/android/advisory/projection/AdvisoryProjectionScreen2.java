package com.robinhood.android.advisory.projection;

import androidx.compose.runtime.SnapshotDoubleState2;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.AdvisoryProjectionViewState;
import com.robinhood.android.advisory.projection.frequency.SimulateDepositFrequency2;
import com.robinhood.models.advisory.p304db.projection.DepositInfo;
import com.robinhood.models.advisory.p304db.projection.ProjectedValues;
import com.robinhood.models.advisory.p304db.projection.RecurringConfiguration;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AdvisoryProjectionScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$1$1", m3645f = "AdvisoryProjectionScreen.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 147}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.AdvisoryProjectionScreenKt$AdvisoryProjectionScreen$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryProjectionScreen2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotFloatState2 $alphaValue$delegate;
    final /* synthetic */ SnapshotState<Currency> $currency$delegate;
    final /* synthetic */ SnapshotState<BigDecimal> $currentPortfolioValue$delegate;
    final /* synthetic */ SnapshotDoubleState2 $depositAmount$delegate;
    final /* synthetic */ SnapshotState<ImmutableList3<Money>> $depositAmountList$delegate;
    final /* synthetic */ SnapshotState<SimulateDepositFrequency> $frequency$delegate;
    final /* synthetic */ SnapshotState<HeaderContent> $headerTexts$delegate;
    final /* synthetic */ SnapshotState<ProjectedValues> $projectedValues$delegate;
    final /* synthetic */ SnapshotState4<AdvisoryProjectionViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdvisoryProjectionScreen2(SnapshotState4<? extends AdvisoryProjectionViewState> snapshotState4, SnapshotState<HeaderContent> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<SimulateDepositFrequency> snapshotState2, SnapshotState<ImmutableList3<Money>> snapshotState3, SnapshotState<BigDecimal> snapshotState5, SnapshotState<Currency> snapshotState6, SnapshotDoubleState2 snapshotDoubleState2, SnapshotState<ProjectedValues> snapshotState7, Continuation<? super AdvisoryProjectionScreen2> continuation) {
        super(2, continuation);
        this.$viewState$delegate = snapshotState4;
        this.$headerTexts$delegate = snapshotState;
        this.$alphaValue$delegate = snapshotFloatState2;
        this.$frequency$delegate = snapshotState2;
        this.$depositAmountList$delegate = snapshotState3;
        this.$currentPortfolioValue$delegate = snapshotState5;
        this.$currency$delegate = snapshotState6;
        this.$depositAmount$delegate = snapshotDoubleState2;
        this.$projectedValues$delegate = snapshotState7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryProjectionScreen2(this.$viewState$delegate, this.$headerTexts$delegate, this.$alphaValue$delegate, this.$frequency$delegate, this.$depositAmountList$delegate, this.$currentPortfolioValue$delegate, this.$currency$delegate, this.$depositAmount$delegate, this.$projectedValues$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryProjectionScreen2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1500, r24) == r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0201  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        ImmutableList3<Money> immutableList3AdvisoryProjectionScreen$lambda$23;
        List<DepositInfo> deposits;
        ProjectedValues projectionValues;
        Object next2;
        List<DepositInfo> deposits2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AdvisoryProjectionViewState advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(this.$viewState$delegate);
            if (advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 instanceof AdvisoryProjectionViewState.Loading) {
                SnapshotState<HeaderContent> snapshotState = this.$headerTexts$delegate;
                AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$12(snapshotState, HeaderContent.copy$default(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$11(snapshotState), null, 0, null, null, null, C9264R.string.projection_screen_loading_text_1, 31, null));
                this.label = 1;
                if (DelayKt.delay(1500L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$0 instanceof AdvisoryProjectionViewState.Loaded) {
                this.$alphaValue$delegate.setFloatValue(1.0f);
                AdvisoryProjectionViewState advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$02 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$0(this.$viewState$delegate);
                Object obj2 = null;
                AdvisoryProjectionViewState.Loaded loaded = advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$02 instanceof AdvisoryProjectionViewState.Loaded ? (AdvisoryProjectionViewState.Loaded) advisoryProjectionViewStateAdvisoryProjectionScreen$lambda$02 : null;
                if (loaded != null) {
                    SnapshotState<SimulateDepositFrequency> snapshotState2 = this.$frequency$delegate;
                    SnapshotState<ImmutableList3<Money>> snapshotState3 = this.$depositAmountList$delegate;
                    SnapshotState<BigDecimal> snapshotState4 = this.$currentPortfolioValue$delegate;
                    SnapshotState<Currency> snapshotState5 = this.$currency$delegate;
                    SnapshotState<HeaderContent> snapshotState6 = this.$headerTexts$delegate;
                    SnapshotDoubleState2 snapshotDoubleState2 = this.$depositAmount$delegate;
                    SnapshotState<ProjectedValues> snapshotState7 = this.$projectedValues$delegate;
                    if (!SimulateDepositFrequency2.isRecurring(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState2))) {
                        immutableList3AdvisoryProjectionScreen$lambda$23 = loaded.getDepositAmountList();
                    } else {
                        Iterator<T> it = loaded.getProjectedReturns().getRecurringDepositConfigurations().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((RecurringConfiguration) next).getDepositFrequency() == SimulateDepositFrequency2.getProjectionFrequency(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState2))) {
                                break;
                            }
                        }
                        RecurringConfiguration recurringConfiguration = (RecurringConfiguration) next;
                        if (recurringConfiguration == null || (deposits = recurringConfiguration.getDeposits()) == null) {
                            immutableList3AdvisoryProjectionScreen$lambda$23 = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$23(snapshotState3);
                        } else {
                            List<DepositInfo> list = deposits;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new Money(loaded.getProjectedReturns().getCurrency(), new BigDecimal(String.valueOf(((DepositInfo) it2.next()).getDepositAmount()))));
                            }
                            immutableList3AdvisoryProjectionScreen$lambda$23 = extensions2.toPersistentList(arrayList);
                            if (immutableList3AdvisoryProjectionScreen$lambda$23 == null) {
                            }
                        }
                    }
                    snapshotState3.setValue(immutableList3AdvisoryProjectionScreen$lambda$23);
                    snapshotState4.setValue(new BigDecimal(String.valueOf(loaded.getProjectedReturns().getInitialPortfolioValue())));
                    snapshotState5.setValue(loaded.getProjectedReturns().getCurrency());
                    AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$12(snapshotState6, HeaderContent.copy$default(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$11(snapshotState6), null, 0, null, null, Money.format$default(new Money(Currencies.USD, AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$5(snapshotState4)), null, false, null, false, 0, boxing.boxInt(0), false, null, false, false, 991, null), 0, 47, null));
                    if (!SimulateDepositFrequency2.isRecurring(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState2))) {
                        projectionValues = loaded.getProjectedReturns().getOneTimeConfiguration().getProjectionValues();
                    } else {
                        Iterator<T> it3 = loaded.getProjectedReturns().getRecurringDepositConfigurations().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            if (((RecurringConfiguration) next2).getDepositFrequency() == SimulateDepositFrequency2.getProjectionFrequency(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$20(snapshotState2))) {
                                break;
                            }
                        }
                        RecurringConfiguration recurringConfiguration2 = (RecurringConfiguration) next2;
                        if (recurringConfiguration2 == null || (deposits2 = recurringConfiguration2.getDeposits()) == null) {
                            projectionValues = AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$17(snapshotState7);
                        } else {
                            Iterator<T> it4 = deposits2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                Object next3 = it4.next();
                                if (((DepositInfo) next3).getDepositAmount() == AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$2(snapshotDoubleState2)) {
                                    obj2 = next3;
                                    break;
                                }
                            }
                            DepositInfo depositInfo = (DepositInfo) obj2;
                            if (depositInfo == null || (projectionValues = depositInfo.getProjectionValues()) == null) {
                            }
                        }
                    }
                    snapshotState7.setValue(projectionValues);
                }
                return Unit.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SnapshotState<HeaderContent> snapshotState8 = this.$headerTexts$delegate;
            AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$12(snapshotState8, HeaderContent.copy$default(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$11(snapshotState8), null, 0, null, null, null, C9264R.string.projection_screen_loading_text_3, 31, null));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SnapshotState<HeaderContent> snapshotState9 = this.$headerTexts$delegate;
        AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$12(snapshotState9, HeaderContent.copy$default(AdvisoryProjectionScreen.AdvisoryProjectionScreen$lambda$11(snapshotState9), null, 0, null, null, null, C9264R.string.projection_screen_loading_text_2, 31, null));
        this.label = 2;
    }
}
