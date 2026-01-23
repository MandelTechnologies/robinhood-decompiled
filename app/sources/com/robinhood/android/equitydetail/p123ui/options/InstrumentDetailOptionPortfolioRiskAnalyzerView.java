package com.robinhood.android.equitydetail.p123ui.options;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.equitydetail.p123ui.OptionsPortfolioRiskAnalyzerEntryPointData;
import com.robinhood.android.equitydetail.p123ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.p409ui.view.Bindable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentDetailOptionPortfolioRiskAnalyzerView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\r\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0002\u0010!R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R/\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionPortfolioRiskAnalyzerView;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/equitydetail/ui/OptionsPortfolioRiskAnalyzerEntryPointData;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "<set-?>", "state", "getState", "()Lcom/robinhood/android/equitydetail/ui/OptionsPortfolioRiskAnalyzerEntryPointData;", "setState", "(Lcom/robinhood/android/equitydetail/ui/OptionsPortfolioRiskAnalyzerEntryPointData;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "bind", "", "SdpContent", "(Landroidx/compose/runtime/Composer;I)V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailOptionPortfolioRiskAnalyzerView extends Hammer_InstrumentDetailOptionPortfolioRiskAnalyzerView implements Bindable<OptionsPortfolioRiskAnalyzerEntryPointData> {
    public static final int $stable = 8;
    public Navigator navigator;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final SnapshotState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InstrumentDetailOptionPortfolioRiskAnalyzerView(Context context, ViewModelStoreOwner viewModelStoreOwner) {
        this(context, viewModelStoreOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(InstrumentDetailOptionPortfolioRiskAnalyzerView instrumentDetailOptionPortfolioRiskAnalyzerView, int i, Composer composer, int i2) {
        instrumentDetailOptionPortfolioRiskAnalyzerView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$1(InstrumentDetailOptionPortfolioRiskAnalyzerView instrumentDetailOptionPortfolioRiskAnalyzerView, int i, Composer composer, int i2) {
        instrumentDetailOptionPortfolioRiskAnalyzerView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ InstrumentDetailOptionPortfolioRiskAnalyzerView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InstrumentDetailOptionPortfolioRiskAnalyzerView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.state = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        return new Component(Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED, null, null, 6, null);
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

    /* JADX WARN: Multi-variable type inference failed */
    private final OptionsPortfolioRiskAnalyzerEntryPointData getState() {
        return (OptionsPortfolioRiskAnalyzerEntryPointData) this.state.getValue();
    }

    private final void setState(OptionsPortfolioRiskAnalyzerEntryPointData optionsPortfolioRiskAnalyzerEntryPointData) {
        this.state.setValue(optionsPortfolioRiskAnalyzerEntryPointData);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(OptionsPortfolioRiskAnalyzerEntryPointData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setState(state);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1187052154);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1187052154, i2, -1, "com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView.SdpContent (InstrumentDetailOptionPortfolioRiskAnalyzerView.kt:51)");
            }
            final OptionsPortfolioRiskAnalyzerEntryPointData state = getState();
            if (state == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstrumentDetailOptionPortfolioRiskAnalyzerView.SdpContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(1279266234, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView.SdpContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: InstrumentDetailOptionPortfolioRiskAnalyzerView.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView$SdpContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ OptionsPortfolioRiskAnalyzerEntryPointData $state;
                    final /* synthetic */ InstrumentDetailOptionPortfolioRiskAnalyzerView this$0;

                    AnonymousClass1(InstrumentDetailOptionPortfolioRiskAnalyzerView instrumentDetailOptionPortfolioRiskAnalyzerView, Context context, OptionsPortfolioRiskAnalyzerEntryPointData optionsPortfolioRiskAnalyzerEntryPointData) {
                        this.this$0 = instrumentDetailOptionPortfolioRiskAnalyzerView;
                        this.$context = context;
                        this.$state = optionsPortfolioRiskAnalyzerEntryPointData;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-741087998, i, -1, "com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView.SdpContent.<anonymous>.<anonymous> (InstrumentDetailOptionPortfolioRiskAnalyzerView.kt:60)");
                        }
                        BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.CHART_24, null, null, 6, null);
                        AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C23386R.string.option_portfolio_risk_analyzer_simulate_all_positions, composer, 0), null, 2, null);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$context) | composer.changedInstance(this.$state);
                        final InstrumentDetailOptionPortfolioRiskAnalyzerView instrumentDetailOptionPortfolioRiskAnalyzerView = this.this$0;
                        final Context context = this.$context;
                        final OptionsPortfolioRiskAnalyzerEntryPointData optionsPortfolioRiskAnalyzerEntryPointData = this.$state;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView$SdpContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InstrumentDetailOptionPortfolioRiskAnalyzerView.C155421.AnonymousClass1.invoke$lambda$1$lambda$0(instrumentDetailOptionPortfolioRiskAnalyzerView, context, optionsPortfolioRiskAnalyzerEntryPointData);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, icon, annotatedString, null, null, null, null, false, false, false, false, false, 0L, (Function0) objRememberedValue, composer, BentoBaseRowState.Start.Icon.$stable << 3, 0, 8185);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(InstrumentDetailOptionPortfolioRiskAnalyzerView instrumentDetailOptionPortfolioRiskAnalyzerView, Context context, OptionsPortfolioRiskAnalyzerEntryPointData optionsPortfolioRiskAnalyzerEntryPointData) {
                        Navigator.DefaultImpls.showFragment$default(instrumentDetailOptionPortfolioRiskAnalyzerView.getNavigator(), context, new OptionsPortfolioRiskAnalyzer.WithAccountNumber(optionsPortfolioRiskAnalyzerEntryPointData.getAccountNumber(), optionsPortfolioRiskAnalyzerEntryPointData.getInstrumentId()), false, false, false, null, false, null, false, false, null, null, 4084, null);
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1279266234, i3, -1, "com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView.SdpContent.<anonymous> (InstrumentDetailOptionPortfolioRiskAnalyzerView.kt:57)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-741087998, true, new AnonymousClass1(InstrumentDetailOptionPortfolioRiskAnalyzerView.this, (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()), state), composer2, 54), composer2, 100663296, 255);
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
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentDetailOptionPortfolioRiskAnalyzerView.SdpContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
