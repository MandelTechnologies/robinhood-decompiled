package com.robinhood.android.equitydetail.p123ui.etp.p126v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.equitydetail.p123ui.EtpCompositionV2Data;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.common.etpcomposition.EtpCompositionV2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpCompositionV2View.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001bR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/v2/EtpCompositionV2View;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "state", "Lcom/robinhood/android/equitydetail/ui/EtpCompositionV2Data;", "bind", "", "etpCompositionV2Data", "bind$feature_equity_detail_externalDebug", "SdpContent", "(Landroidx/compose/runtime/Composer;I)V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class EtpCompositionV2View extends Hammer_EtpCompositionV2View {
    public static final int $stable = 8;
    public Navigator navigator;
    private EtpCompositionV2Data state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EtpCompositionV2View(Context context, ViewModelStoreOwner viewModelStoreOwner) {
        this(context, viewModelStoreOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(EtpCompositionV2View etpCompositionV2View, int i, Composer composer, int i2) {
        etpCompositionV2View.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$1(EtpCompositionV2View etpCompositionV2View, int i, Composer composer, int i2) {
        etpCompositionV2View.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ EtpCompositionV2View(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EtpCompositionV2View(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        return new Component(Component.ComponentType.ETP_COMPOSITION_SECTION, null, null, 6, null);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final void bind$feature_equity_detail_externalDebug(EtpCompositionV2Data etpCompositionV2Data) {
        Intrinsics.checkNotNullParameter(etpCompositionV2Data, "etpCompositionV2Data");
        this.state = etpCompositionV2Data;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-116868867);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116868867, i2, -1, "com.robinhood.android.equitydetail.ui.etp.v2.EtpCompositionV2View.SdpContent (EtpCompositionV2View.kt:37)");
            }
            final EtpCompositionV2Data etpCompositionV2Data = this.state;
            if (etpCompositionV2Data == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.etp.v2.EtpCompositionV2View$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EtpCompositionV2View.SdpContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(1999719869, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.etp.v2.EtpCompositionV2View.SdpContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1999719869, i3, -1, "com.robinhood.android.equitydetail.ui.etp.v2.EtpCompositionV2View.SdpContent.<anonymous> (EtpCompositionV2View.kt:43)");
                    }
                    EtpCompositionV2.EtpCompositionV2(etpCompositionV2Data.getInstrumentUuid(), null, null, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.etp.v2.EtpCompositionV2View$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EtpCompositionV2View.SdpContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
