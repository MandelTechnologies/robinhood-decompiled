package com.robinhood.shared.iac.herocards.p383ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
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
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.iac.herocards.p383ui.IacHeroCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IacHeroCardView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\r\u0010 \u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "uiState", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardProvider;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "callback", "Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardView$Callback;", "bind", "", "provider", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Callback", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class IacHeroCardView extends Hammer_IacHeroCardView {
    public static final int $stable = 8;
    private Callback callback;
    public EventLogger eventLogger;
    public Navigator navigator;
    private Screen screen;
    private final SnapshotState<IacHeroCardProvider> uiState;
    private final ViewModelStoreOwner viewModelStoreOwner;

    /* compiled from: IacHeroCardView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardView$Callback;", "", "onHeroCardDismissed", "", "provider", "Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardProvider;", "onHeroCardSeen", "onHeroCardClicked", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {

        /* compiled from: IacHeroCardView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onHeroCardClicked(Callback callback, IacHeroCardProvider provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }

            public static void onHeroCardDismissed(Callback callback, IacHeroCardProvider provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }

            public static void onHeroCardSeen(Callback callback, IacHeroCardProvider provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }
        }

        void onHeroCardClicked(IacHeroCardProvider provider);

        void onHeroCardDismissed(IacHeroCardProvider provider);

        void onHeroCardSeen(IacHeroCardProvider provider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(IacHeroCardView iacHeroCardView, int i, Composer composer, int i2) {
        iacHeroCardView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(IacHeroCardView iacHeroCardView, int i, Composer composer, int i2) {
        iacHeroCardView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ IacHeroCardView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacHeroCardView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.uiState = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
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

    public static /* synthetic */ void bind$default(IacHeroCardView iacHeroCardView, IacHeroCardProvider iacHeroCardProvider, Screen screen, Callback callback, int i, Object obj) {
        if ((i & 4) != 0) {
            callback = null;
        }
        iacHeroCardView.bind(iacHeroCardProvider, screen, callback);
    }

    public final void bind(IacHeroCardProvider provider, Screen screen, Callback callback) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.uiState.setValue(provider);
        this.screen = screen;
        this.callback = callback;
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1009673659);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009673659, i2, -1, "com.robinhood.shared.iac.herocards.ui.IacHeroCardView.Content (IacHeroCardView.kt:58)");
            }
            final IacHeroCardProvider value = this.uiState.getValue();
            if (value == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IacHeroCardView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final IacHeroCard card = value.getCard();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-157271536, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardView.Content.1
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
                        ComposerKt.traceEventStart(-157271536, i3, -1, "com.robinhood.shared.iac.herocards.ui.IacHeroCardView.Content.<anonymous> (IacHeroCardView.kt:63)");
                    }
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalNavigator.getLocalNavigator().provides(IacHeroCardView.this.getNavigator()), AutoLoggingCompositionLocals.getLocalEventLogger().provides(IacHeroCardView.this.getEventLogger()), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, IacHeroCardView.this.screen, null, null, null, null, 61, null)), LocalViewModelStoreOwner.INSTANCE.provides(IacHeroCardView.this.viewModelStoreOwner)}, ComposableLambda3.rememberComposableLambda(1156411088, true, new AnonymousClass1(card, IacHeroCardView.this, value), composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: IacHeroCardView.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.iac.herocards.ui.IacHeroCardView$Content$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ IacHeroCard $card;
                    final /* synthetic */ IacHeroCardProvider $provider;
                    final /* synthetic */ IacHeroCardView this$0;

                    AnonymousClass1(IacHeroCard iacHeroCard, IacHeroCardView iacHeroCardView, IacHeroCardProvider iacHeroCardProvider) {
                        this.$card = iacHeroCard;
                        this.this$0 = iacHeroCardView;
                        this.$provider = iacHeroCardProvider;
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
                            ComposerKt.traceEventStart(1156411088, i, -1, "com.robinhood.shared.iac.herocards.ui.IacHeroCardView.Content.<anonymous>.<anonymous> (IacHeroCardView.kt:71)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        IacHeroCard iacHeroCard = this.$card;
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$provider);
                        final IacHeroCardView iacHeroCardView = this.this$0;
                        final IacHeroCardProvider iacHeroCardProvider = this.$provider;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardView$Content$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return IacHeroCardView.C390511.AnonymousClass1.invoke$lambda$1$lambda$0(iacHeroCardView, iacHeroCardProvider, (IacHeroCard) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0) | composer.changedInstance(this.$provider);
                        final IacHeroCardView iacHeroCardView2 = this.this$0;
                        final IacHeroCardProvider iacHeroCardProvider2 = this.$provider;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardView$Content$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return IacHeroCardView.C390511.AnonymousClass1.invoke$lambda$3$lambda$2(iacHeroCardView2, iacHeroCardProvider2, (IacHeroCard) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function12 = (Function1) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0) | composer.changedInstance(this.$provider);
                        final IacHeroCardView iacHeroCardView3 = this.this$0;
                        final IacHeroCardProvider iacHeroCardProvider3 = this.$provider;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardView$Content$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return IacHeroCardView.C390511.AnonymousClass1.invoke$lambda$5$lambda$4(iacHeroCardView3, iacHeroCardProvider3, (IacHeroCard) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function13 = (Function1) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance4 = composer.changedInstance(this.this$0) | composer.changedInstance(this.$provider);
                        final IacHeroCardView iacHeroCardView4 = this.this$0;
                        final IacHeroCardProvider iacHeroCardProvider4 = this.$provider;
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardView$Content$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return IacHeroCardView.C390511.AnonymousClass1.invoke$lambda$7$lambda$6(iacHeroCardView4, iacHeroCardProvider4, (IacHeroCard) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        IacHeroCardComposable.IacHeroCardComposable(iacHeroCard, modifierM5146paddingqDBjuR0$default, function1, function12, function13, (Function1) objRememberedValue4, null, composer, 0, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(IacHeroCardView iacHeroCardView, IacHeroCardProvider iacHeroCardProvider, IacHeroCard it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Callback callback = iacHeroCardView.callback;
                        if (callback != null) {
                            callback.onHeroCardSeen(iacHeroCardProvider);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(IacHeroCardView iacHeroCardView, IacHeroCardProvider iacHeroCardProvider, IacHeroCard it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Callback callback = iacHeroCardView.callback;
                        if (callback != null) {
                            callback.onHeroCardClicked(iacHeroCardProvider);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(IacHeroCardView iacHeroCardView, IacHeroCardProvider iacHeroCardProvider, IacHeroCard it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Callback callback = iacHeroCardView.callback;
                        if (callback != null) {
                            callback.onHeroCardClicked(iacHeroCardProvider);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(IacHeroCardView iacHeroCardView, IacHeroCardProvider iacHeroCardProvider, IacHeroCard it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Callback callback = iacHeroCardView.callback;
                        if (callback != null) {
                            callback.onHeroCardDismissed(iacHeroCardProvider);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IacHeroCardView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
