package com.robinhood.android.equitydetail.p123ui.earnings.p125v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.equitydetail.p123ui.EarningsV2ViewData;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.earnings.EarningsComposable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: EarningsV2View.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0013J\r\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/v2/EarningsV2View;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "state", "Lcom/robinhood/android/equitydetail/ui/EarningsV2ViewData;", "bind", "", "earningsV2ViewData", "bind$feature_equity_detail_externalDebug", "SdpContent", "(Landroidx/compose/runtime/Composer;I)V", "onCallClicked", "callUrl", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EarningsV2View extends Hammer_EarningsV2View {
    public static final int $stable = 8;
    private EarningsV2ViewData state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EarningsV2View(Context context, ViewModelStoreOwner viewModelStoreOwner) {
        this(context, viewModelStoreOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(EarningsV2View earningsV2View, int i, Composer composer, int i2) {
        earningsV2View.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$1(EarningsV2View earningsV2View, int i, Composer composer, int i2) {
        earningsV2View.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$3(EarningsV2View earningsV2View, int i, Composer composer, int i2) {
        earningsV2View.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarningsV2View(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EarningsV2View(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        return new Component(Component.ComponentType.EARNINGS_SECTION, null, null, 6, null);
    }

    public final void bind$feature_equity_detail_externalDebug(EarningsV2ViewData earningsV2ViewData) {
        Intrinsics.checkNotNullParameter(earningsV2ViewData, "earningsV2ViewData");
        this.state = earningsV2ViewData;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(805853743);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(805853743, i2, -1, "com.robinhood.android.equitydetail.ui.earnings.v2.EarningsV2View.SdpContent (EarningsV2View.kt:33)");
            }
            EarningsV2ViewData earningsV2ViewData = this.state;
            if (earningsV2ViewData == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.earnings.v2.EarningsV2View$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EarningsV2View.SdpContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Screen screen = getScreen();
            if (screen == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.earnings.v2.EarningsV2View$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EarningsV2View.SdpContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            UUID instrumentUuid = earningsV2ViewData.getInstrumentUuid();
            String string2 = earningsV2ViewData.getInstrumentUuid().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Screen screenCopy$default = Screen.copy$default(screen, null, null, string2, null, 11, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new EarningsV2View2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EarningsComposable.EarningsComposable(instrumentUuid, false, null, null, screenCopy$default, (Function1) ((KFunction) objRememberedValue), null, composerStartRestartGroup, 48, 76);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.earnings.v2.EarningsV2View$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EarningsV2View.SdpContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCallClicked(String callUrl) {
        WebUtils.viewUrl$default(getContext(), callUrl, 0, 4, (Object) null);
    }
}
