package com.robinhood.android.equitydetail.p123ui.etp;

import android.view.View;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.bonfire.etp.EtpSector;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: EtpCompositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionViewState;", "hostView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "updateDetails", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/db/EtpDetails;", "updateDisplayType", "displayType", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "onItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "onSectorSelected", "sector", "Lcom/robinhood/models/db/bonfire/etp/EtpSector;", "toggleBondsExpanded", "resetActiveItem", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EtpCompositionDuxo extends ViewDuxo<EtpCompositionViewState> {
    public static final int $stable = ViewDuxo.$stable;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EtpCompositionDuxo(View hostView) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Object[] objArr = 0 == true ? 1 : 0;
        super(hostView, new EtpCompositionViewState(null, null, null, null, null, null, null, null, false, null, false, 2047, null), objArr, 4, 0 == true ? 1 : 0);
    }

    public final void updateDetails(final EtpDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpCompositionDuxo.updateDetails$lambda$0(details, (EtpCompositionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EtpCompositionViewState updateDetails$lambda$0(EtpDetails etpDetails, EtpCompositionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.hasSameData(etpDetails) ? applyMutation : applyMutation.copyUsing(etpDetails);
    }

    public final void updateDisplayType(final EtpCompositionViewState2 displayType) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpCompositionDuxo.updateDisplayType$lambda$2(displayType, (EtpCompositionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EtpCompositionViewState updateDisplayType$lambda$2(EtpCompositionViewState2 etpCompositionViewState2, EtpCompositionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UUID instrumentId = applyMutation.getInstrumentId();
        if (instrumentId != null) {
            EtpCompositionViewState4.getEtpCompositionDataTypeManager().put(instrumentId, etpCompositionViewState2);
        }
        return EtpCompositionViewState.copy$default(applyMutation, null, null, null, null, null, null, null, etpCompositionViewState2, false, null, false, 1663, null);
    }

    public final void onItemSelected(final EtpCompositionItemHolder item) {
        Intrinsics.checkNotNullParameter(item, "item");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpCompositionDuxo.onItemSelected$lambda$3(item, (EtpCompositionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EtpCompositionViewState onItemSelected$lambda$3(EtpCompositionItemHolder etpCompositionItemHolder, EtpCompositionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EtpCompositionViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, etpCompositionItemHolder, false, 1535, null);
    }

    public final void onSectorSelected(final EtpSector sector) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpCompositionDuxo.onSectorSelected$lambda$4(sector, (EtpCompositionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EtpCompositionViewState onSectorSelected$lambda$4(EtpSector etpSector, EtpCompositionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.activate(etpSector);
    }

    public final void toggleBondsExpanded() {
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpCompositionDuxo.toggleBondsExpanded$lambda$5((EtpCompositionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EtpCompositionViewState toggleBondsExpanded$lambda$5(EtpCompositionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EtpCompositionViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, !applyMutation.getListExpanded(), null, false, 1791, null);
    }

    public final void resetActiveItem() {
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpCompositionDuxo.resetActiveItem$lambda$6((EtpCompositionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EtpCompositionViewState resetActiveItem$lambda$6(EtpCompositionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EtpCompositionViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, 1535, null);
    }
}
