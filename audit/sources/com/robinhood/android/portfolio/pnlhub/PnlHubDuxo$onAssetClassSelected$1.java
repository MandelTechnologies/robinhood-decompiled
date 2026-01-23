package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnl.p214db.SupportedAssetClass;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PnlHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onAssetClassSelected$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes11.dex */
final class PnlHubDuxo$onAssetClassSelected$1 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
    final /* synthetic */ PnlHubAssetClass $assetClass;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubDuxo$onAssetClassSelected$1(PnlHubAssetClass pnlHubAssetClass, Continuation<? super PnlHubDuxo$onAssetClassSelected$1> continuation) {
        super(2, continuation);
        this.$assetClass = pnlHubAssetClass;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubDuxo$onAssetClassSelected$1 pnlHubDuxo$onAssetClassSelected$1 = new PnlHubDuxo$onAssetClassSelected$1(this.$assetClass, continuation);
        pnlHubDuxo$onAssetClassSelected$1.L$0 = obj;
        return pnlHubDuxo$onAssetClassSelected$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
        return ((PnlHubDuxo$onAssetClassSelected$1) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PnlHubDataState pnlHubDataState = (PnlHubDataState) this.L$0;
        PnlHubAssetClass pnlHubAssetClass = this.$assetClass;
        boolean zIsCryptoPnlHubEnabled = pnlHubDataState.isCryptoPnlHubEnabled();
        List<SupportedAssetClass> supportedAssetTypes = pnlHubDataState.getSupportedAssetTypes();
        if (supportedAssetTypes == null) {
            supportedAssetTypes = CollectionsKt.emptyList();
        }
        List<SupportedAssetClass> list = supportedAssetTypes;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((SupportedAssetClass) it.next()).getAssetClass() == AssetClass.OPTION) {
                    z = true;
                    break;
                }
            }
        }
        return PnlHubDataState.copy$default(pnlHubDataState, null, PnlHubViewState2.toAssetTypeList(pnlHubAssetClass, zIsCryptoPnlHubEnabled, z), null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, null, false, false, false, 2097149, null);
    }
}
