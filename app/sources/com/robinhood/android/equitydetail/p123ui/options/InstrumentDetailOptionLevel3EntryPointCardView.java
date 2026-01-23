package com.robinhood.android.equitydetail.p123ui.options;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equitydetail.p123ui.options.InstrumentDetailOptionLevel3EntryPointCardView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstrumentDetailOptionLevel3EntryPointCardView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0010H\u0002J\r\u0010\u0016\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionLevel3EntryPointCardView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "accountNumber", "Landroidx/compose/runtime/MutableState;", "", "callbacks", "Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionLevel3EntryPointCardView$Callback;", "bind", "", "goToOptionsOnboarding", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Callback", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailOptionLevel3EntryPointCardView extends Hammer_InstrumentDetailOptionLevel3EntryPointCardView {
    public static final int $stable = 8;
    private final SnapshotState<String> accountNumber;
    private Callback callbacks;
    public Navigator navigator;

    /* compiled from: InstrumentDetailOptionLevel3EntryPointCardView.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionLevel3EntryPointCardView$Callback;", "", "onCardSeen", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void onCardSeen();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public InstrumentDetailOptionLevel3EntryPointCardView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2(InstrumentDetailOptionLevel3EntryPointCardView instrumentDetailOptionLevel3EntryPointCardView, int i, Composer composer, int i2) {
        instrumentDetailOptionLevel3EntryPointCardView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ InstrumentDetailOptionLevel3EntryPointCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InstrumentDetailOptionLevel3EntryPointCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.accountNumber = SnapshotState3.mutableStateOf$default(null, null, 2, null);
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

    public static /* synthetic */ void bind$default(InstrumentDetailOptionLevel3EntryPointCardView instrumentDetailOptionLevel3EntryPointCardView, String str, Callback callback, int i, Object obj) {
        if ((i & 2) != 0) {
            callback = null;
        }
        instrumentDetailOptionLevel3EntryPointCardView.bind(str, callback);
    }

    public final void bind(String accountNumber, Callback callbacks) {
        this.accountNumber.setValue(accountNumber);
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToOptionsOnboarding(String accountNumber) {
        if (accountNumber != null) {
            Navigator navigator = getNavigator();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, context, new OptionOnboarding(new OptionOnboarding2.AccountNumber(accountNumber), new OptionOnboarding.OptionOnboardingSource.Legacy(AnalyticsStrings.BUTTON_GROUP_TITLE_STOCK_DETAIL), null, 4, null), null, false, null, null, 60, null);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1874661483);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1874661483, i2, -1, "com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView.Content (InstrumentDetailOptionLevel3EntryPointCardView.kt:86)");
            }
            final String value = this.accountNumber.getValue();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.TRUE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final Component component = new Component(Component.ComponentType.CARD, "options_l3_entry_point", null, 4, null);
            final Screen screen = new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InstrumentDetailOptionLevel3EntryPointCardView2(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(671998499, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView.Content.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(671998499, i3, -1, "com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView.Content.<anonymous> (InstrumentDetailOptionLevel3EntryPointCardView.kt:107)");
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, (Modifier) null, (EnterTransition) null, EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambda3.rememberComposableLambda(-378967813, true, new AnonymousClass1(this, value, screen, component, current, mutableTransitionState), composer3, 54), composer3, MutableTransitionState.$stable | 199680, 22);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: InstrumentDetailOptionLevel3EntryPointCardView.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView$Content$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                    final /* synthetic */ String $accountNumber;
                    final /* synthetic */ Component $component;
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ Screen $screen;
                    final /* synthetic */ MutableTransitionState<Boolean> $visibleState;
                    final /* synthetic */ InstrumentDetailOptionLevel3EntryPointCardView this$0;

                    AnonymousClass1(InstrumentDetailOptionLevel3EntryPointCardView instrumentDetailOptionLevel3EntryPointCardView, String str, Screen screen, Component component, EventLogger eventLogger, MutableTransitionState<Boolean> mutableTransitionState) {
                        this.this$0 = instrumentDetailOptionLevel3EntryPointCardView;
                        this.$accountNumber = str;
                        this.$screen = screen;
                        this.$component = component;
                        this.$eventLogger = eventLogger;
                        this.$visibleState = mutableTransitionState;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                        invoke(animatedVisibilityScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-378967813, i, -1, "com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView.Content.<anonymous>.<anonymous> (InstrumentDetailOptionLevel3EntryPointCardView.kt:111)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$accountNumber);
                        final InstrumentDetailOptionLevel3EntryPointCardView instrumentDetailOptionLevel3EntryPointCardView = this.this$0;
                        final String str = this.$accountNumber;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView$Content$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InstrumentDetailOptionLevel3EntryPointCardView.C155282.AnonymousClass1.invoke$lambda$1$lambda$0(instrumentDetailOptionLevel3EntryPointCardView, str);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        CardKt.Card(ModifiersKt.autoLogEvents$default(SizeKt.wrapContentHeight$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5142padding3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), null, false, 3, null), new UserInteractionEventDescriptor(null, this.$screen, null, null, this.$component, null, 45, null), true, false, false, true, false, null, 108, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12)), CardDefaults.INSTANCE.m5729cardColorsro_MJ88(bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambda3.rememberComposableLambda(-415490835, true, new AnonymousClass2(this.this$0, this.$accountNumber, this.$eventLogger, this.$screen, this.$component, this.$visibleState), composer, 54), composer, 196608, 24);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(InstrumentDetailOptionLevel3EntryPointCardView instrumentDetailOptionLevel3EntryPointCardView, String str) {
                        instrumentDetailOptionLevel3EntryPointCardView.goToOptionsOnboarding(str);
                        return Unit.INSTANCE;
                    }

                    /* compiled from: InstrumentDetailOptionLevel3EntryPointCardView.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView$Content$2$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<Column5, Composer, Integer, Unit> {
                        final /* synthetic */ String $accountNumber;
                        final /* synthetic */ Component $component;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ Screen $screen;
                        final /* synthetic */ MutableTransitionState<Boolean> $visibleState;
                        final /* synthetic */ InstrumentDetailOptionLevel3EntryPointCardView this$0;

                        AnonymousClass2(InstrumentDetailOptionLevel3EntryPointCardView instrumentDetailOptionLevel3EntryPointCardView, String str, EventLogger eventLogger, Screen screen, Component component, MutableTransitionState<Boolean> mutableTransitionState) {
                            this.this$0 = instrumentDetailOptionLevel3EntryPointCardView;
                            this.$accountNumber = str;
                            this.$eventLogger = eventLogger;
                            this.$screen = screen;
                            this.$component = component;
                            this.$visibleState = mutableTransitionState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
                            invoke(column5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Card, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-415490835, i, -1, "com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView.Content.<anonymous>.<anonymous>.<anonymous> (InstrumentDetailOptionLevel3EntryPointCardView.kt:129)");
                            }
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$accountNumber);
                            final InstrumentDetailOptionLevel3EntryPointCardView instrumentDetailOptionLevel3EntryPointCardView = this.this$0;
                            final String str = this.$accountNumber;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView$Content$2$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InstrumentDetailOptionLevel3EntryPointCardView.C155282.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(instrumentDetailOptionLevel3EntryPointCardView, str);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$screen) | composer.changedInstance(this.$component) | composer.changedInstance(this.$visibleState);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Screen screen = this.$screen;
                            final Component component = this.$component;
                            final MutableTransitionState<Boolean> mutableTransitionState = this.$visibleState;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView$Content$2$1$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InstrumentDetailOptionLevel3EntryPointCardView.C155282.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(eventLogger, screen, component, mutableTransitionState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            InstrumentDetailOptionLevel3EntryPointCardView3.InstrumentDetailOptionLevel3EntryPointCardComposable(function0, (Function0) objRememberedValue2, null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(InstrumentDetailOptionLevel3EntryPointCardView instrumentDetailOptionLevel3EntryPointCardView, String str) {
                            instrumentDetailOptionLevel3EntryPointCardView.goToOptionsOnboarding(str);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, Component component, MutableTransitionState mutableTransitionState) {
                            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, screen, component, null, null, false, 56, null);
                            mutableTransitionState.setTargetState(Boolean.FALSE);
                            return Unit.INSTANCE;
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentDetailOptionLevel3EntryPointCardView.Content$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
