package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterAccountTotalViewBinding;
import com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.p148fx.tooltip.FxTooltip;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AccountCenterAccountTotalView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterAccountTotalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$AccountTotalItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterAccountTotalViewBinding;", "getBinding", "()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterAccountTotalViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "identifier", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "bind", "", "state", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountCenterAccountTotalView extends Hammer_AccountCenterAccountTotalView implements Bindable<UiTypedAccountCenterItem.AccountTotalItem> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final String identifier;
    public Navigator navigator;
    private final Screen screen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountCenterAccountTotalView.class, "binding", "getBinding()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterAccountTotalViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterAccountTotalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AccountCenterAccountTotalView2.INSTANCE);
        this.screen = new Screen(Screen.Name.ACCOUNT_CENTER, null, null, null, 14, null);
        this.identifier = "account-center";
    }

    private final IncludeAccountCenterAccountTotalViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeAccountCenterAccountTotalViewBinding) value;
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

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final UiTypedAccountCenterItem.AccountTotalItem state) {
        String string2;
        Intrinsics.checkNotNullParameter(state, "state");
        AnimatedRhTextView animatedRhTextView = getBinding().totalText;
        Money usdAmount = state.getUsdAmount();
        if (usdAmount == null || (string2 = Money.format$default(usdAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            string2 = ViewsKt.getString(this, C11048R.string.general_label_emdash);
        }
        animatedRhTextView.setText(string2, true);
        getBinding().fxTooltipButton.setContent(ComposableLambda3.composableLambdaInstance(2029225045, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView.bind.1
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
                    ComposerKt.traceEventStart(2029225045, i, -1, "com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView.bind.<anonymous> (AccountCenterAccountTotalView.kt:49)");
                }
                if (state.getShowFxTooltipButton()) {
                    ProvidedValue[] providedValueArr = {LocalNavigator.getLocalNavigator().provides(this.getNavigator()), LocalScarletManager.getLocalScarletManager().provides(ScarletManager2.getScarletManager(this))};
                    final AccountCenterAccountTotalView accountCenterAccountTotalView = this;
                    final UiTypedAccountCenterItem.AccountTotalItem accountTotalItem = state;
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(138165018, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView.bind.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(138165018, i2, -1, "com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView.bind.<anonymous>.<anonymous> (AccountCenterAccountTotalView.kt:54)");
                            }
                            Context context = accountCenterAccountTotalView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(context));
                            final AccountCenterAccountTotalView accountCenterAccountTotalView2 = accountCenterAccountTotalView;
                            final UiTypedAccountCenterItem.AccountTotalItem accountTotalItem2 = accountTotalItem;
                            BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(1302503720, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView.bind.1.1.1
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
                                        ComposerKt.traceEventStart(1302503720, i3, -1, "com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView.bind.<anonymous>.<anonymous>.<anonymous> (AccountCenterAccountTotalView.kt:55)");
                                    }
                                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(accountCenterAccountTotalView2.identifier, accountCenterAccountTotalView2.screen, null, null, null, null, 60, null), ComposableLambda3.rememberComposableLambda(-665657123, true, new C495251(accountTotalItem2), composer3, 54), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: AccountCenterAccountTotalView.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C495251 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ UiTypedAccountCenterItem.AccountTotalItem $state;

                                    C495251(UiTypedAccountCenterItem.AccountTotalItem accountTotalItem) {
                                        this.$state = accountTotalItem;
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
                                            ComposerKt.traceEventStart(-665657123, i, -1, "com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountCenterAccountTotalView.kt:61)");
                                        }
                                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                                        Money usdAmount = this.$state.getUsdAmount();
                                        boolean showFxTooltip = this.$state.getShowFxTooltip();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.$state);
                                        final UiTypedAccountCenterItem.AccountTotalItem accountTotalItem = this.$state;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView$bind$1$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AccountCenterAccountTotalView.C82951.AnonymousClass1.C495241.C495251.invoke$lambda$2$lambda$1(accountTotalItem, ((Boolean) obj).booleanValue());
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        FxTooltip.FxTooltipButton(usdAmount, modifierM5142padding3ABfNKs, showFxTooltip, (Function1) objRememberedValue, null, false, composer, 0, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$2$lambda$1(UiTypedAccountCenterItem.AccountTotalItem accountTotalItem, boolean z) {
                                        Function1<Boolean, Unit> onShowFxTooltip = accountTotalItem.getOnShowFxTooltip();
                                        if (onShowFxTooltip != null) {
                                            onShowFxTooltip.invoke(Boolean.valueOf(z));
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer2, 54), composer2, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, ProvidedValue.$stable | 48);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ComposeView fxTooltipButton = getBinding().fxTooltipButton;
        Intrinsics.checkNotNullExpressionValue(fxTooltipButton, "fxTooltipButton");
        fxTooltipButton.setVisibility(state.getShowFxTooltipButton() ? 0 : 8);
    }

    /* compiled from: AccountCenterAccountTotalView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterAccountTotalView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/AccountCenterAccountTotalView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AccountCenterAccountTotalView> {
        private final /* synthetic */ Inflater<AccountCenterAccountTotalView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AccountCenterAccountTotalView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AccountCenterAccountTotalView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_account_center_account_total_view);
        }
    }
}
