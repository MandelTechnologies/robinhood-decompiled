package com.robinhood.android.trade.options.confirmation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderConfirmationFeeFooterComposeView.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0014J\r\u0010\u000e\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u000fR\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFeeFooterComposeView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "state", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/trade/options/confirmation/FeeFooterState;", "bind", "", "onAttachedToWindow", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionOrderConfirmationFeeFooterComposeView extends GenericComposeView {
    public static final int $stable = GenericComposeView.$stable;
    private final SnapshotState<FeeFooterState> state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public OptionOrderConfirmationFeeFooterComposeView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(OptionOrderConfirmationFeeFooterComposeView optionOrderConfirmationFeeFooterComposeView, int i, Composer composer, int i2) {
        optionOrderConfirmationFeeFooterComposeView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ OptionOrderConfirmationFeeFooterComposeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OptionOrderConfirmationFeeFooterComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public final void bind(FeeFooterState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state.setValue(state);
    }

    @Override // com.robinhood.compose.app.GenericComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new C297931(ScarletManager2.getScarletManager(this)));
    }

    /* compiled from: OptionOrderConfirmationFeeFooterComposeView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFeeFooterComposeView$onAttachedToWindow$1 */
    /* synthetic */ class C297931 extends AdaptedFunctionReference implements Function1<ScarletOverlay, Unit> {
        C297931(Object obj) {
            super(1, obj, ScarletManager.class, "putOverlay", "putOverlay(Lcom/robinhood/scarlet/ScarletOverlay;Ljava/lang/Boolean;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScarletOverlay scarletOverlay) {
            invoke2(scarletOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ScarletOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ScarletManager.putOverlay$default((ScarletManager) this.receiver, p0, null, 2, null);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(74675160);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(74675160, i2, -1, "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFeeFooterComposeView.Content (OptionOrderConfirmationFeeFooterComposeView.kt:32)");
            }
            FeeFooterState value = this.state.getValue();
            if (value != null) {
                OptionOrderConfirmationFeeFooterComposable.OptionOrderConfirmationFeeFooterComposable(value, null, composerStartRestartGroup, 0, 2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFeeFooterComposeView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderConfirmationFeeFooterComposeView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
