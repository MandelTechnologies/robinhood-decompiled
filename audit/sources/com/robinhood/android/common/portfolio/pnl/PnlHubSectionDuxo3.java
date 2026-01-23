package com.robinhood.android.common.portfolio.pnl;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossRealized;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossSupportedAssetTypes;
import com.robinhood.android.portfolio.pnl.p214db.SupportedAssetClass;
import com.robinhood.models.p320db.sheriff.User;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PnlHubSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionViewState;", "isOptionsSupported", "", "realizedPnl", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "supportedAssetTypes", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "pnlUpdatesEnabled", "user", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$1$3$1", m3645f = "PnlHubSectionDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$1$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PnlHubSectionDuxo3 extends ContinuationImpl7 implements Function6<Boolean, ProfitAndLossRealized, ProfitAndLossSupportedAssetTypes, Boolean, User, Continuation<? super PnlHubSectionViewState>, Object> {
    final /* synthetic */ String $accountNumber;
    int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ PnlHubSectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubSectionDuxo3(PnlHubSectionDuxo pnlHubSectionDuxo, String str, Continuation<? super PnlHubSectionDuxo3> continuation) {
        super(6, continuation);
        this.this$0 = pnlHubSectionDuxo;
        this.$accountNumber = str;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, ProfitAndLossRealized profitAndLossRealized, ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes, Boolean bool2, User user, Continuation<? super PnlHubSectionViewState> continuation) {
        return invoke(bool.booleanValue(), profitAndLossRealized, profitAndLossSupportedAssetTypes, bool2.booleanValue(), user, continuation);
    }

    public final Object invoke(boolean z, ProfitAndLossRealized profitAndLossRealized, ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes, boolean z2, User user, Continuation<? super PnlHubSectionViewState> continuation) {
        PnlHubSectionDuxo3 pnlHubSectionDuxo3 = new PnlHubSectionDuxo3(this.this$0, this.$accountNumber, continuation);
        pnlHubSectionDuxo3.Z$0 = z;
        pnlHubSectionDuxo3.L$0 = profitAndLossRealized;
        pnlHubSectionDuxo3.L$1 = profitAndLossSupportedAssetTypes;
        pnlHubSectionDuxo3.Z$1 = z2;
        pnlHubSectionDuxo3.L$2 = user;
        return pnlHubSectionDuxo3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ProfitAndLossRealized profitAndLossRealized;
        ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes;
        boolean z;
        int i;
        boolean z2;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z3 = this.Z$0;
            profitAndLossRealized = (ProfitAndLossRealized) this.L$0;
            profitAndLossSupportedAssetTypes = (ProfitAndLossSupportedAssetTypes) this.L$1;
            z = this.Z$1;
            User user = (User) this.L$2;
            boolean zCheckIfDataIsStale = this.this$0.checkIfDataIsStale(profitAndLossRealized.getReceivedAt());
            ?? r1 = (user.getIsUk() || user.getIsRhsg()) ? 1 : 0;
            String str2 = this.$accountNumber;
            PnlHubSectionDuxo pnlHubSectionDuxo = this.this$0;
            this.L$0 = profitAndLossRealized;
            this.L$1 = profitAndLossSupportedAssetTypes;
            this.L$2 = str2;
            this.Z$0 = z;
            this.Z$1 = zCheckIfDataIsStale;
            this.I$0 = r1;
            this.label = 1;
            obj = pnlHubSectionDuxo.toSubtitle(z3, r1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = r1;
            z2 = zCheckIfDataIsStale;
            str = str2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            boolean z4 = this.Z$1;
            z = this.Z$0;
            str = (String) this.L$2;
            profitAndLossSupportedAssetTypes = (ProfitAndLossSupportedAssetTypes) this.L$1;
            profitAndLossRealized = (ProfitAndLossRealized) this.L$0;
            ResultKt.throwOnFailure(obj);
            z2 = z4;
        }
        boolean z5 = z;
        ProfitAndLossRealized profitAndLossRealized2 = profitAndLossRealized;
        Integer num = (Integer) obj;
        List<SupportedAssetClass> assetTypes = profitAndLossSupportedAssetTypes.getAssetTypes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assetTypes, 10));
        Iterator<T> it = assetTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((SupportedAssetClass) it.next()).getAssetClass());
        }
        return new PnlHubSectionViewState(str, num, arrayList, profitAndLossRealized2, i == 0 && !this.this$0.newTagShownPref.get(), !profitAndLossSupportedAssetTypes.getAssetTypes().isEmpty(), z2, z5);
    }
}
