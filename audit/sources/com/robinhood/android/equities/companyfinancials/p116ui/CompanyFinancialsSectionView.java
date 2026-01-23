package com.robinhood.android.equities.companyfinancials.p116ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionViewState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CompanyFinancialsSectionView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001'B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010$\u001a\u00020%H\u0017¢\u0006\u0002\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/ui/CompanyFinancialsSectionView;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/equities/companyfinancials/ui/CompanyFinancialsSectionView$Callback;", "getCallbacks", "()Lcom/robinhood/android/equities/companyfinancials/ui/CompanyFinancialsSectionView$Callback;", "setCallbacks", "(Lcom/robinhood/android/equities/companyfinancials/ui/CompanyFinancialsSectionView$Callback;)V", "<set-?>", "Ljava/util/UUID;", "instrumentId", "getInstrumentId", "()Ljava/util/UUID;", "setInstrumentId", "(Ljava/util/UUID;)V", "instrumentId$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "viewState", "getViewState", "()Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "setViewState", "(Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;)V", "viewState$delegate", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "SdpContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callback", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CompanyFinancialsSectionView extends Hammer_CompanyFinancialsSectionView {
    public static final int $stable = 8;
    private Callback callbacks;

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final SnapshotState instrumentId;

    /* renamed from: viewState$delegate, reason: from kotlin metadata */
    private final SnapshotState viewState;

    /* compiled from: CompanyFinancialsSectionView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001f\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/ui/CompanyFinancialsSectionView$Callback;", "", "onTimePeriodSelected", "", "timePeriodType", "", "onScrubIndexChanged", "instrumentId", "Ljava/util/UUID;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "(Ljava/util/UUID;Ljava/lang/Integer;)V", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void onScrubIndexChanged(UUID instrumentId, Integer index);

        void onTimePeriodSelected(String timePeriodType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CompanyFinancialsSectionView(Context context, ViewModelStoreOwner viewModelStoreOwner) {
        this(context, viewModelStoreOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(CompanyFinancialsSectionView companyFinancialsSectionView, int i, Composer composer, int i2) {
        companyFinancialsSectionView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$5(CompanyFinancialsSectionView companyFinancialsSectionView, int i, Composer composer, int i2) {
        companyFinancialsSectionView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ CompanyFinancialsSectionView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CompanyFinancialsSectionView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.instrumentId = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.viewState = SnapshotState3.mutableStateOf$default(CompanyFinancialsSectionViewState.Disabled.INSTANCE, null, 2, null);
    }

    public final Callback getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callback callback) {
        this.callbacks = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UUID getInstrumentId() {
        return (UUID) this.instrumentId.getValue();
    }

    public final void setInstrumentId(UUID uuid) {
        this.instrumentId.setValue(uuid);
    }

    public final CompanyFinancialsSectionViewState getViewState() {
        return (CompanyFinancialsSectionViewState) this.viewState.getValue();
    }

    public final void setViewState(CompanyFinancialsSectionViewState companyFinancialsSectionViewState) {
        Intrinsics.checkNotNullParameter(companyFinancialsSectionViewState, "<set-?>");
        this.viewState.setValue(companyFinancialsSectionViewState);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        return new Component(Component.ComponentType.COMPANY_FINANCIALS_SECTION, null, null, 6, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(286294582);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(286294582, i2, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionView.SdpContent (CompanyFinancialsSectionView.kt:40)");
            }
            final UUID instrumentId = getInstrumentId();
            if (instrumentId == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CompanyFinancialsSectionView.SdpContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            CompanyFinancialsSectionViewState viewState = getViewState();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionView$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CompanyFinancialsSectionView.SdpContent$lambda$2$lambda$1(this.f$0, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(instrumentId);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionView$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CompanyFinancialsSectionView.SdpContent$lambda$4$lambda$3(this.f$0, instrumentId, (Integer) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            CompanyFinancialsSection.CompanyFinancialsSection(viewState, function1, (Function1) objRememberedValue2, null, composerStartRestartGroup, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CompanyFinancialsSectionView.SdpContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$2$lambda$1(CompanyFinancialsSectionView companyFinancialsSectionView, String timePeriod) {
        Intrinsics.checkNotNullParameter(timePeriod, "timePeriod");
        Callback callback = companyFinancialsSectionView.callbacks;
        if (callback != null) {
            callback.onTimePeriodSelected(timePeriod);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$4$lambda$3(CompanyFinancialsSectionView companyFinancialsSectionView, UUID uuid, Integer num) {
        Callback callback = companyFinancialsSectionView.callbacks;
        if (callback != null) {
            callback.onScrubIndexChanged(uuid, num);
        }
        return Unit.INSTANCE;
    }
}
