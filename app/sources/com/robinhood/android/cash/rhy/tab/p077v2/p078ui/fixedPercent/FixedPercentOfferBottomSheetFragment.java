package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.fixedPercent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.RhyHasSeenFixedPercentPopupPref;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.staticcontent.model.MobileContentPage;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: FixedPercentOfferBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002#$B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\r\u0010\u001a\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/fixedPercent/FixedPercentOfferBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyHasSeenFixedPercentPopupPref", "Lcom/robinhood/prefs/BooleanPreference;", "getRhyHasSeenFixedPercentPopupPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setRhyHasSeenFixedPercentPopupPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onAttach", "", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FixedPercentOfferBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated, AutoLoggableFragment {
    public static final String PERCENTAGE_BACK_PLACEHOLDER = "{{ .PERCENT }}";
    public EventLogger eventLogger;

    @RhyHasSeenFixedPercentPopupPref
    public BooleanPreference rhyHasSeenFixedPercentPopupPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(null, null, getScreenName(), null, 11, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment, int i, Composer composer, int i2) {
        fixedPercentOfferBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
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

    public final BooleanPreference getRhyHasSeenFixedPercentPopupPref() {
        BooleanPreference booleanPreference = this.rhyHasSeenFixedPercentPopupPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyHasSeenFixedPercentPopupPref");
        return null;
    }

    public final void setRhyHasSeenFixedPercentPopupPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.rhyHasSeenFixedPercentPopupPref = booleanPreference;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        getRhyHasSeenFixedPercentPopupPref().set(true);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1405605467);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1405605467, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment.ComposeContent (FixedPercentOfferBottomSheetFragment.kt:63)");
            }
            Component component = new Component(Component.ComponentType.FLAT_CASHBACK_BOTTOM_SHEET, String.valueOf(((Args) INSTANCE.getArgs((Fragment) this)).getMerchantOffer().getGlobalOfferId()), null, 4, null);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, component, null, 45, null), ComposableLambda3.rememberComposableLambda(231358042, true, new C103971(component), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FixedPercentOfferBottomSheetFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FixedPercentOfferBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment$ComposeContent$1 */
    static final class C103971 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Component $loggingComponent;

        C103971(Component component) {
            this.$loggingComponent = component;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Painter painterPainterResource;
            Companion companion;
            int i2;
            Component component;
            Modifier.Companion companion2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(231358042, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment.ComposeContent.<anonymous> (FixedPercentOfferBottomSheetFragment.kt:74)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion3, null, true, false, false, false, false, null, 125, null);
            FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment = FixedPercentOfferBottomSheetFragment.this;
            Component component2 = this.$loggingComponent;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierAlign = column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion4.getCenterHorizontally());
            Companion companion6 = FixedPercentOfferBottomSheetFragment.INSTANCE;
            int percentBack = ((Args) companion6.getArgs((Fragment) fixedPercentOfferBottomSheetFragment)).getPercentBack();
            if (percentBack == 1) {
                composer.startReplaceGroup(204462149);
                painterPainterResource = PainterResources_androidKt.painterResource(C10285R.drawable.svg_one_percent_back, composer, 0);
                composer.endReplaceGroup();
            } else if (percentBack != 2) {
                composer.startReplaceGroup(204467557);
                painterPainterResource = PainterResources_androidKt.painterResource(C10285R.drawable.svg_ten_dollars_back, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(204464805);
                painterPainterResource = PainterResources_androidKt.painterResource(C10285R.drawable.svg_two_percent_back, composer, 0);
                composer.endReplaceGroup();
            }
            ImageKt.Image(painterPainterResource, (String) null, modifierAlign, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            Composer composer2 = composer;
            String subtitle = ((Args) companion6.getArgs((Fragment) fixedPercentOfferBottomSheetFragment)).getTextResources().getSubtitle();
            composer2.startReplaceGroup(204473840);
            if (subtitle == null) {
                companion = companion6;
                i2 = i3;
                component = component2;
                companion2 = companion3;
            } else {
                Modifier modifierAlign2 = column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion4.getCenterHorizontally());
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                companion = companion6;
                i2 = i3;
                component = component2;
                companion2 = companion3;
                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(subtitle, modifierAlign2, null, null, null, false, null, (Function0) objRememberedValue, composer, 12583296, 120);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            Modifier modifierAlign3 = column6.align(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion4.getCenterHorizontally());
            Companion companion7 = companion;
            String strReplace$default = StringsKt.replace$default(((Args) companion7.getArgs((Fragment) fixedPercentOfferBottomSheetFragment)).getTextResources().getTitle(), FixedPercentOfferBottomSheetFragment.PERCENTAGE_BACK_PLACEHOLDER, String.valueOf(((Args) companion7.getArgs((Fragment) fixedPercentOfferBottomSheetFragment)).getPercentBack()), false, 4, (Object) null);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(strReplace$default, modifierAlign3, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getDisplayCapsuleLarge(), composer, 0, 0, 8124);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1224379931, true, new FixedPercentOfferBottomSheetFragment2(fixedPercentOfferBottomSheetFragment, component), composer, 54), composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: FixedPercentOfferBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/fixedPercent/FixedPercentOfferBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "percentBack", "", "merchantOffer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "textResources", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "<init>", "(ILcom/robinhood/models/db/mcduckling/MerchantOfferV2;Lcom/robinhood/staticcontent/model/MobileContentPage;)V", "getPercentBack", "()I", "getMerchantOffer", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "getTextResources", "()Lcom/robinhood/staticcontent/model/MobileContentPage;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final MerchantOfferV2 merchantOffer;
        private final int percentBack;
        private final MobileContentPage textResources;

        /* compiled from: FixedPercentOfferBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt(), (MerchantOfferV2) parcel.readParcelable(Args.class.getClassLoader()), (MobileContentPage) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, int i, MerchantOfferV2 merchantOfferV2, MobileContentPage mobileContentPage, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = args.percentBack;
            }
            if ((i2 & 2) != 0) {
                merchantOfferV2 = args.merchantOffer;
            }
            if ((i2 & 4) != 0) {
                mobileContentPage = args.textResources;
            }
            return args.copy(i, merchantOfferV2, mobileContentPage);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPercentBack() {
            return this.percentBack;
        }

        /* renamed from: component2, reason: from getter */
        public final MerchantOfferV2 getMerchantOffer() {
            return this.merchantOffer;
        }

        /* renamed from: component3, reason: from getter */
        public final MobileContentPage getTextResources() {
            return this.textResources;
        }

        public final Args copy(int percentBack, MerchantOfferV2 merchantOffer, MobileContentPage textResources) {
            Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
            Intrinsics.checkNotNullParameter(textResources, "textResources");
            return new Args(percentBack, merchantOffer, textResources);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.percentBack == args.percentBack && Intrinsics.areEqual(this.merchantOffer, args.merchantOffer) && Intrinsics.areEqual(this.textResources, args.textResources);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.percentBack) * 31) + this.merchantOffer.hashCode()) * 31) + this.textResources.hashCode();
        }

        public String toString() {
            return "Args(percentBack=" + this.percentBack + ", merchantOffer=" + this.merchantOffer + ", textResources=" + this.textResources + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.percentBack);
            dest.writeParcelable(this.merchantOffer, flags);
            dest.writeParcelable(this.textResources, flags);
        }

        public Args(int i, MerchantOfferV2 merchantOffer, MobileContentPage textResources) {
            Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
            Intrinsics.checkNotNullParameter(textResources, "textResources");
            this.percentBack = i;
            this.merchantOffer = merchantOffer;
            this.textResources = textResources;
        }

        public final int getPercentBack() {
            return this.percentBack;
        }

        public final MerchantOfferV2 getMerchantOffer() {
            return this.merchantOffer;
        }

        public final MobileContentPage getTextResources() {
            return this.textResources;
        }
    }

    /* compiled from: FixedPercentOfferBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/fixedPercent/FixedPercentOfferBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/fixedPercent/FixedPercentOfferBottomSheetFragment;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/fixedPercent/FixedPercentOfferBottomSheetFragment$Args;", "<init>", "()V", "PERCENTAGE_BACK_PLACEHOLDER", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<FixedPercentOfferBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, fixedPercentOfferBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FixedPercentOfferBottomSheetFragment newInstance(Args args) {
            return (FixedPercentOfferBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, fixedPercentOfferBottomSheetFragment, args);
        }
    }
}
