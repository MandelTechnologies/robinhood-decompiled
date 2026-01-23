package com.robinhood.android.advisor.marketplace.onboarding.hub;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.BiasAlignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponents;
import com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingComponents5;
import com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.theme.style.SegmentedControlStyle;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorMeeting;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: AdvisorMarketplaceOnboardingHubScreen.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a-\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a)\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a!\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\tX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010!X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020#X\u008a\u0084\u0002"}, m3636d2 = {"IconSize", "Landroidx/compose/ui/unit/Dp;", "F", "IconSpacing", "HubToggleTestTag", "", "HubToggle", "", "activeHubType", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/HubType;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisor/marketplace/onboarding/hub/HubType;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HubHeader", "onSwitchClicked", "AdvisorMarketplaceOnboardingHubLoadedScreen", "state", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState$Loaded;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "AdvisorMarketplaceOnboardingHubScreen", "duxo", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-advisor-marketplace-onboarding_externalDebug", "horizontalBias", "Landroidx/compose/ui/BiasAlignment;", "alignment", "activeHub", "activeMeetingsFilter", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/MeetingsFilter;", "viewState", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceOnboardingHubScreen {
    public static final String HubToggleTestTag = "hub_toggle";
    private static final float IconSize = C2002Dp.m7995constructorimpl(32);
    private static final float IconSpacing = C2002Dp.m7995constructorimpl(2);

    /* compiled from: AdvisorMarketplaceOnboardingHubScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MeetingsHub.values().length];
            try {
                iArr[MeetingsHub.UPCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MeetingsHub.PAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdvisorMarketplaceOnboardingHubScreen6.values().length];
            try {
                iArr2[AdvisorMarketplaceOnboardingHubScreen6.MEETINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdvisorMarketplaceOnboardingHubScreen6.MATCHES.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$30(AdvisorMarketplaceOnboardingHubViewState.Loaded loaded, Modifier modifier, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        AdvisorMarketplaceOnboardingHubLoadedScreen(loaded, modifier, paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorMarketplaceOnboardingHubScreen$lambda$32(Modifier modifier, AdvisorMarketplaceOnboardingHubDuxo advisorMarketplaceOnboardingHubDuxo, int i, int i2, Composer composer, int i3) {
        AdvisorMarketplaceOnboardingHubScreen(modifier, advisorMarketplaceOnboardingHubDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubHeader$lambda$13(AdvisorMarketplaceOnboardingHubScreen6 advisorMarketplaceOnboardingHubScreen6, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HubHeader(advisorMarketplaceOnboardingHubScreen6, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubToggle$lambda$11(AdvisorMarketplaceOnboardingHubScreen6 advisorMarketplaceOnboardingHubScreen6, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HubToggle(advisorMarketplaceOnboardingHubScreen6, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ce  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HubToggle(final AdvisorMarketplaceOnboardingHubScreen6 advisorMarketplaceOnboardingHubScreen6, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        List listListOf;
        int iIndexOf;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        Object objRememberedValue3;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Iterator it;
        final Modifier modifier3;
        long jM21940getSegmentForegroundDisabledColor0d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1153876893);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(advisorMarketplaceOnboardingHubScreen6.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1153876893, i3, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.HubToggle (AdvisorMarketplaceOnboardingHubScreen.kt:78)");
                }
                SegmentedControlStyle segmentedControlStyle = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
                listListOf = CollectionsKt.listOf((Object[]) new AdvisorMarketplaceOnboardingHubScreen6[]{AdvisorMarketplaceOnboardingHubScreen6.MATCHES, AdvisorMarketplaceOnboardingHubScreen6.MEETINGS});
                iIndexOf = listListOf.indexOf(advisorMarketplaceOnboardingHubScreen6);
                Modifier modifierPadding = PaddingKt.padding(Background3.m4871backgroundbw27NRU(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(LocalShowPlaceholder.withBentoCirclePlaceholder$default(TestTag3.testTag(modifier4, HubToggleTestTag), false, 1, null), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), false, null, null, Haptics.hapticClick(function0, composerStartRestartGroup, (i3 >> 3) & 14), 7, null), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle.getSpacing(composerStartRestartGroup, 0).getContainerPadding());
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int size = listListOf.size();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(iIndexOf);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(iIndexOf != 0 ? new BiasAlignment(-1.0f, 0.0f) : (iIndexOf == 1 && listListOf.size() == 3) ? new BiasAlignment(0.0f, 0.0f) : new BiasAlignment(1.0f, 0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BiasAlignment biasAlignmentHubToggle$lambda$10$lambda$1 = HubToggle$lambda$10$lambda$1((SnapshotState) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisorMarketplaceOnboardingHubScreen.HubToggle$lambda$10$lambda$3$lambda$2((BiasAlignment) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisorMarketplaceOnboardingHubScreen.HubToggle$lambda$10$lambda$5$lambda$4((AnimationVectors3) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = iIndexOf;
                ?? r14 = 0;
                SnapshotState4 snapshotState4AnimateValueAsState = AnimateAsState.animateValueAsState(biasAlignmentHubToggle$lambda$10$lambda$1, VectorConvertersKt.TwoWayConverter(function1, (Function1) objRememberedValue3), null, null, null, null, composerStartRestartGroup, 0, 60);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BoxKt.Box(boxScopeInstance.align(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion4, IconSize), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21939getSegmentBackgroundColor0d7_KjU(), RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), HubToggle$lambda$10$lambda$6(snapshotState4AnimateValueAsState)), composerStartRestartGroup, 0);
                Modifier modifierSelectableGroup = SelectableGroup.selectableGroup(companion4);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5090spacedByD5KLDUw(IconSpacing, companion2.getCenterHorizontally()), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSelectableGroup);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-2121269932);
                it = listListOf.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AdvisorMarketplaceOnboardingHubScreen6 advisorMarketplaceOnboardingHubScreen62 = (AdvisorMarketplaceOnboardingHubScreen6) next;
                    int i8 = i5;
                    boolean z = i6 == i8 ? true : r14;
                    SegmentedControlStyle segmentedControlStyle2 = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(553264021);
                        jM21940getSegmentForegroundDisabledColor0d7_KjU = segmentedControlStyle2.getColors(composerStartRestartGroup, r14).m21941getSegmentForegroundEnabledColor0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(553351348);
                        jM21940getSegmentForegroundDisabledColor0d7_KjU = segmentedControlStyle2.getColors(composerStartRestartGroup, r14).m21940getSegmentForegroundDisabledColor0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    long j = jM21940getSegmentForegroundDisabledColor0d7_KjU;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Clip.clip(companion5, RoundedCornerShape2.getCircleShape()), IconSize);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), r14);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r14);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Iterator it2 = it;
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                    i5 = i8;
                    Composer composer2 = composerStartRestartGroup;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(advisorMarketplaceOnboardingHubScreen62.getIcon()), StringResources_androidKt.stringResource(advisorMarketplaceOnboardingHubScreen62.getTitle(), composerStartRestartGroup, 0), j, BoxScopeInstance.INSTANCE.align(companion5, companion6.getCenter()), null, false, composer2, BentoIcon4.Size16.$stable, 48);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endNode();
                    r14 = 0;
                    i6 = i7;
                    it = it2;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisorMarketplaceOnboardingHubScreen.HubToggle$lambda$11(advisorMarketplaceOnboardingHubScreen6, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SegmentedControlStyle segmentedControlStyle3 = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
            listListOf = CollectionsKt.listOf((Object[]) new AdvisorMarketplaceOnboardingHubScreen6[]{AdvisorMarketplaceOnboardingHubScreen6.MATCHES, AdvisorMarketplaceOnboardingHubScreen6.MEETINGS});
            iIndexOf = listListOf.indexOf(advisorMarketplaceOnboardingHubScreen6);
            Modifier modifierPadding2 = PaddingKt.padding(Background3.m4871backgroundbw27NRU(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(LocalShowPlaceholder.withBentoCirclePlaceholder$default(TestTag3.testTag(modifier4, HubToggleTestTag), false, 1, null), segmentedControlStyle3.getSizing(composerStartRestartGroup, 0).getShape()), false, null, null, Haptics.hapticClick(function0, composerStartRestartGroup, (i3 >> 3) & 14), 7, null), segmentedControlStyle3.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), segmentedControlStyle3.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle3.getSpacing(composerStartRestartGroup, 0).getContainerPadding());
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int size2 = listListOf.size();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(size2) | composerStartRestartGroup.changed(iIndexOf);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(iIndexOf != 0 ? new BiasAlignment(-1.0f, 0.0f) : (iIndexOf == 1 && listListOf.size() == 3) ? new BiasAlignment(0.0f, 0.0f) : new BiasAlignment(1.0f, 0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BiasAlignment biasAlignmentHubToggle$lambda$10$lambda$12 = HubToggle$lambda$10$lambda$1((SnapshotState) objRememberedValue);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    Function1 function12 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i52 = iIndexOf;
                    ?? r142 = 0;
                    SnapshotState4 snapshotState4AnimateValueAsState2 = AnimateAsState.animateValueAsState(biasAlignmentHubToggle$lambda$10$lambda$12, VectorConvertersKt.TwoWayConverter(function12, (Function1) objRememberedValue3), null, null, null, null, composerStartRestartGroup, 0, 60);
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    BoxKt.Box(boxScopeInstance2.align(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion42, IconSize), segmentedControlStyle3.getColors(composerStartRestartGroup, 0).m21939getSegmentBackgroundColor0d7_KjU(), RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), HubToggle$lambda$10$lambda$6(snapshotState4AnimateValueAsState2)), composerStartRestartGroup, 0);
                    Modifier modifierSelectableGroup2 = SelectableGroup.selectableGroup(companion42);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5090spacedByD5KLDUw(IconSpacing, companion22.getCenterHorizontally()), companion22.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSelectableGroup2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-2121269932);
                        it = listListOf.iterator();
                        int i62 = 0;
                        while (it.hasNext()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisorMarketplaceOnboardingHubScreen6 AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$16(SnapshotState<AdvisorMarketplaceOnboardingHubScreen6> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeetingsHub AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$20(SnapshotState<MeetingsHub> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisorMarketplaceOnboardingHubViewState AdvisorMarketplaceOnboardingHubScreen$lambda$31(SnapshotState4<? extends AdvisorMarketplaceOnboardingHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final BiasAlignment HubToggle$lambda$10$lambda$1(SnapshotState<BiasAlignment> snapshotState) {
        return snapshotState.getValue();
    }

    private static final BiasAlignment HubToggle$lambda$10$lambda$6(SnapshotState4<BiasAlignment> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVectors3 HubToggle$lambda$10$lambda$3$lambda$2(BiasAlignment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AnimationVectors3(it.getHorizontalBias(), it.getVerticalBias());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiasAlignment HubToggle$lambda$10$lambda$5$lambda$4(AnimationVectors3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BiasAlignment(it.getV1(), it.getV2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HubHeader(final AdvisorMarketplaceOnboardingHubScreen6 advisorMarketplaceOnboardingHubScreen6, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-583622972);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(advisorMarketplaceOnboardingHubScreen6.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-583622972, i3, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.HubHeader (AdvisorMarketplaceOnboardingHubScreen.kt:169)");
                    }
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(advisorMarketplaceOnboardingHubScreen6.getTitle(), composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
                    HubToggle(advisorMarketplaceOnboardingHubScreen6, function02, null, composer2, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisorMarketplaceOnboardingHubScreen.HubHeader$lambda$13(advisorMarketplaceOnboardingHubScreen6, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) == 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(advisorMarketplaceOnboardingHubScreen6.getTitle(), composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
                    HubToggle(advisorMarketplaceOnboardingHubScreen6, function02, null, composer2, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisorMarketplaceOnboardingHubLoadedScreen(final AdvisorMarketplaceOnboardingHubViewState.Loaded state, Modifier modifier, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        boolean zChanged;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1838093943);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = i4 == 0 ? PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1838093943, i3, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubLoadedScreen (AdvisorMarketplaceOnboardingHubScreen.kt:191)");
                    }
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$15$lambda$14();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(state);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$19$lambda$18(state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28(state, snapshotState, snapshotState2, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    paddingValues2 = paddingValuesM5137PaddingValuesYgX7TsA$default;
                    modifier2 = modifier3;
                    LazyDslKt.LazyColumn(modifier2, null, paddingValues2, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, ((i3 >> 3) & 14) | (i3 & 896), 506);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                final Modifier modifier4 = modifier2;
                final PaddingValues paddingValues3 = paddingValues2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$30(state, modifier4, paddingValues3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            paddingValues2 = paddingValues;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Object[] objArr3 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Object[] objArr22 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(state);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$19$lambda$18(state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28(state, snapshotState, snapshotState2, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        paddingValues2 = paddingValuesM5137PaddingValuesYgX7TsA$default;
                        modifier2 = modifier3;
                        LazyDslKt.LazyColumn(modifier2, null, paddingValues2, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, ((i3 >> 3) & 14) | (i3 & 896), 506);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            final Modifier modifier42 = modifier2;
            final PaddingValues paddingValues32 = paddingValues2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i3 & 147) != 146) {
        }
        final Modifier modifier422 = modifier2;
        final PaddingValues paddingValues322 = paddingValues2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$15$lambda$14() {
        return SnapshotState3.mutableStateOf$default(AdvisorMarketplaceOnboardingHubScreen6.MATCHES, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$19$lambda$18(AdvisorMarketplaceOnboardingHubViewState.Loaded loaded) {
        return SnapshotState3.mutableStateOf$default(loaded.getDefaultMeetingsFilter(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28(AdvisorMarketplaceOnboardingHubViewState.Loaded loaded, SnapshotState snapshotState, SnapshotState snapshotState2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1005054132, true, new AdvisorMarketplaceOnboardingHubScreen2(snapshotState)), 3, null);
        int i = WhenMappings.$EnumSwitchMapping$1[AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$16(snapshotState).ordinal()];
        if (i == 1) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-901157052, true, new AdvisorMarketplaceOnboardingHubScreen3(loaded, snapshotState2)), 3, null);
            MeetingsHub meetingsHubAdvisorMarketplaceOnboardingHubLoadedScreen$lambda$20 = AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$20(snapshotState2);
            int i2 = meetingsHubAdvisorMarketplaceOnboardingHubLoadedScreen$lambda$20 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[meetingsHubAdvisorMarketplaceOnboardingHubLoadedScreen$lambda$20.ordinal()];
            if (i2 == -1) {
                LazyListScope.item$default(LazyColumn, null, null, AdvisorMarketplaceOnboardingHubScreen4.INSTANCE.m1730x6fa33c56(), 3, null);
            } else if (i2 == 1) {
                final List<AdvisorMeeting> upcomingMeetings = loaded.getMeetingsHubResponse().getUpcomingMeetings();
                final Function1 function1 = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisorMarketplaceOnboardingHubScreen.m1726xcce39998((AdvisorMeeting) obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisorMarketplaceOnboardingHubScreen.m1727xcce39999((AdvisorMeeting) obj);
                    }
                };
                LazyColumn.items(upcomingMeetings.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$$inlined$items$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i3) {
                        return function1.invoke(upcomingMeetings.get(i3));
                    }
                }, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$$inlined$items$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i3) {
                        return function12.invoke(upcomingMeetings.get(i3));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$$inlined$items$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i3, Composer composer, int i4) {
                        int i5;
                        if ((i4 & 6) == 0) {
                            i5 = (composer.changed(lazyItemScope) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & 48) == 0) {
                            i5 |= composer.changed(i3) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        AdvisorMeeting advisorMeeting = (AdvisorMeeting) upcomingMeetings.get(i3);
                        composer.startReplaceGroup(1341291289);
                        MeetingsHub2.UpcomingMeeting(advisorMeeting, null, composer, 0, 2);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                final List<AdvisorMeeting> pastMeetings = loaded.getMeetingsHubResponse().getPastMeetings();
                final Function1 function13 = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisorMarketplaceOnboardingHubScreen.m1728xcce3999b((AdvisorMeeting) obj);
                    }
                };
                final Function1 function14 = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisorMarketplaceOnboardingHubScreen.m1729xcce3999c((AdvisorMeeting) obj);
                    }
                };
                LazyColumn.items(pastMeetings.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$$inlined$items$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i3) {
                        return function13.invoke(pastMeetings.get(i3));
                    }
                }, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$$inlined$items$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i3) {
                        return function14.invoke(pastMeetings.get(i3));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$$inlined$items$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i3, Composer composer, int i4) {
                        int i5;
                        if ((i4 & 6) == 0) {
                            i5 = (composer.changed(lazyItemScope) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & 48) == 0) {
                            i5 |= composer.changed(i3) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        AdvisorMeeting advisorMeeting = (AdvisorMeeting) pastMeetings.get(i3);
                        composer.startReplaceGroup(469037652);
                        MeetingsHub2.PastMeeting(advisorMeeting, null, composer, 0, 2);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$lambda$22 */
    public static final Object m1726xcce39998(AdvisorMeeting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$lambda$23 */
    public static final Object m1727xcce39999(AdvisorMeeting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "upcoming_meeting";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$lambda$25 */
    public static final Object m1728xcce3999b(AdvisorMeeting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$29$lambda$28$lambda$26 */
    public static final Object m1729xcce3999c(AdvisorMeeting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "past_meeting";
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisorMarketplaceOnboardingHubScreen(final Modifier modifier, final AdvisorMarketplaceOnboardingHubDuxo advisorMarketplaceOnboardingHubDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-267846779);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(advisorMarketplaceOnboardingHubDuxo)) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AdvisorMarketplaceOnboardingHubDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubScreen$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubScreen$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    advisorMarketplaceOnboardingHubDuxo = (AdvisorMarketplaceOnboardingHubDuxo) baseDuxo;
                    i5 &= -113;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-267846779, i5, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreen (AdvisorMarketplaceOnboardingHubScreen.kt:271)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(advisorMarketplaceOnboardingHubDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                Modifier modifier2 = modifier;
                Composer composer4 = composer2;
                AdvisorMarketplaceOnboardingComponents.BackHandlingScaffold(modifier2, AdvisorMarketplaceOnboardingComponents5.CLOSE, ComposableLambda3.rememberComposableLambda(-669947919, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt.AdvisorMarketplaceOnboardingHubScreen.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                        invoke(paddingValues, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer5, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer5.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-669947919, i6, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreen.<anonymous> (AdvisorMarketplaceOnboardingHubScreen.kt:278)");
                        }
                        AdvisorMarketplaceOnboardingHubViewState advisorMarketplaceOnboardingHubViewStateAdvisorMarketplaceOnboardingHubScreen$lambda$31 = AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubScreen$lambda$31(snapshotState4CollectAsStateWithLifecycle);
                        if (advisorMarketplaceOnboardingHubViewStateAdvisorMarketplaceOnboardingHubScreen$lambda$31 instanceof AdvisorMarketplaceOnboardingHubViewState.Loaded) {
                            composer5.startReplaceGroup(294698173);
                            AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen((AdvisorMarketplaceOnboardingHubViewState.Loaded) advisorMarketplaceOnboardingHubViewStateAdvisorMarketplaceOnboardingHubScreen$lambda$31, null, paddingValues, composer5, (i6 << 6) & 896, 2);
                            composer5.endReplaceGroup();
                        } else {
                            if (!Intrinsics.areEqual(advisorMarketplaceOnboardingHubViewStateAdvisorMarketplaceOnboardingHubScreen$lambda$31, AdvisorMarketplaceOnboardingHubViewState.Loading.INSTANCE)) {
                                composer5.startReplaceGroup(425145608);
                                composer5.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer5.startReplaceGroup(294941275);
                            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer5, 0, 0);
                            composer5.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer4, (i5 & 14) | 432, 0);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier = modifier2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            }
            composer2 = composerStartRestartGroup;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<? extends AdvisorMarketplaceOnboardingHubViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(advisorMarketplaceOnboardingHubDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
            Modifier modifier22 = modifier;
            Composer composer42 = composer2;
            AdvisorMarketplaceOnboardingComponents.BackHandlingScaffold(modifier22, AdvisorMarketplaceOnboardingComponents5.CLOSE, ComposableLambda3.rememberComposableLambda(-669947919, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt.AdvisorMarketplaceOnboardingHubScreen.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                    invoke(paddingValues, composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer5, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer5.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-669947919, i6, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreen.<anonymous> (AdvisorMarketplaceOnboardingHubScreen.kt:278)");
                    }
                    AdvisorMarketplaceOnboardingHubViewState advisorMarketplaceOnboardingHubViewStateAdvisorMarketplaceOnboardingHubScreen$lambda$31 = AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubScreen$lambda$31(snapshotState4CollectAsStateWithLifecycle2);
                    if (advisorMarketplaceOnboardingHubViewStateAdvisorMarketplaceOnboardingHubScreen$lambda$31 instanceof AdvisorMarketplaceOnboardingHubViewState.Loaded) {
                        composer5.startReplaceGroup(294698173);
                        AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen((AdvisorMarketplaceOnboardingHubViewState.Loaded) advisorMarketplaceOnboardingHubViewStateAdvisorMarketplaceOnboardingHubScreen$lambda$31, null, paddingValues, composer5, (i6 << 6) & 896, 2);
                        composer5.endReplaceGroup();
                    } else {
                        if (!Intrinsics.areEqual(advisorMarketplaceOnboardingHubViewStateAdvisorMarketplaceOnboardingHubScreen$lambda$31, AdvisorMarketplaceOnboardingHubViewState.Loading.INSTANCE)) {
                            composer5.startReplaceGroup(425145608);
                            composer5.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer5.startReplaceGroup(294941275);
                        LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer5, 0, 0);
                        composer5.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer42, (i5 & 14) | 432, 0);
            composer3 = composer42;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier = modifier22;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubScreen$lambda$32(modifier, advisorMarketplaceOnboardingHubDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
