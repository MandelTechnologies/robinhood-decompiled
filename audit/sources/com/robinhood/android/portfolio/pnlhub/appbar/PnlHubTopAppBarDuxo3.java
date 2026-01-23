package com.robinhood.android.portfolio.pnlhub.appbar;

import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PnlHubTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarDuxo$bind$1", m3645f = "PnlHubTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarDuxo$bind$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PnlHubTopAppBarDuxo3 extends ContinuationImpl7 implements Function2<PnlHubTopAppBarDataState, Continuation<? super PnlHubTopAppBarDataState>, Object> {
    final /* synthetic */ List<PnlHubAssetClass> $availableAssetClasses;
    final /* synthetic */ CountryCode $locality;
    final /* synthetic */ boolean $optionsSupported;
    final /* synthetic */ PnlHubAssetClass $selectedAssetClass;
    final /* synthetic */ boolean $showCryptoFilterTooltip;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PnlHubTopAppBarDuxo3(List<? extends PnlHubAssetClass> list, PnlHubAssetClass pnlHubAssetClass, boolean z, CountryCode countryCode, boolean z2, Continuation<? super PnlHubTopAppBarDuxo3> continuation) {
        super(2, continuation);
        this.$availableAssetClasses = list;
        this.$selectedAssetClass = pnlHubAssetClass;
        this.$optionsSupported = z;
        this.$locality = countryCode;
        this.$showCryptoFilterTooltip = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubTopAppBarDuxo3 pnlHubTopAppBarDuxo3 = new PnlHubTopAppBarDuxo3(this.$availableAssetClasses, this.$selectedAssetClass, this.$optionsSupported, this.$locality, this.$showCryptoFilterTooltip, continuation);
        pnlHubTopAppBarDuxo3.L$0 = obj;
        return pnlHubTopAppBarDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PnlHubTopAppBarDataState pnlHubTopAppBarDataState, Continuation<? super PnlHubTopAppBarDataState> continuation) {
        return ((PnlHubTopAppBarDuxo3) create(pnlHubTopAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PnlHubTopAppBarDataState.copy$default((PnlHubTopAppBarDataState) this.L$0, this.$availableAssetClasses, this.$selectedAssetClass, this.$optionsSupported, this.$locality, this.$showCryptoFilterTooltip, false, 32, null);
    }
}
