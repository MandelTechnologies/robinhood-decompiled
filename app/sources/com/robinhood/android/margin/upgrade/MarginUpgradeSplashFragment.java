package com.robinhood.android.margin.upgrade;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import coil.compose.AsyncImagePainter4;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.lib.margin.api.ApiMarginOnboardingSplash;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment;
import com.robinhood.android.navigation.app.contracts.MarginUpgradeContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MarginUpgradeSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment;", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "<init>", "()V", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "callbacks", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-margin-upgrade_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeSplashFragment extends BaseMarginUpgradeStepComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginUpgradeSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final MarginUpgradeStep step = MarginUpgradeStep.SPLASH;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginUpgradeSplashFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: MarginUpgradeSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Callbacks;", "", "onSplashContinue", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSplashContinue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(MarginUpgradeSplashFragment marginUpgradeSplashFragment, int i, Composer composer, int i2) {
        marginUpgradeSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public MarginUpgradeStep getStep() {
        return this.step;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment, com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        BentoTheme bentoTheme;
        int i2;
        Modifier.Companion companion;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1019022279);
        int i3 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(this) ? 4 : 2) : i;
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1019022279, i3, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment.ComposeContent (MarginUpgradeSplashFragment.kt:64)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Typeface font = ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_medium);
            Typeface font2 = ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_text_bold);
            composerStartRestartGroup.startReplaceGroup(-27855701);
            ArrayList arrayList = new ArrayList();
            composerStartRestartGroup.startReplaceGroup(-27851378);
            for (Map.Entry<String, String> entry : ((Args) INSTANCE.getArgs((Fragment) this)).getSplash().getHeaderAnimationTextMapping().entrySet()) {
                String[] strArr = {"**", entry.getKey()};
                LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty = LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.TEXT, entry.getValue(), (String[]) Arrays.copyOf(strArr, 2), composerStartRestartGroup, 6);
                LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty2 = LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.TYPEFACE, Intrinsics.areEqual(entry.getKey(), "robinhood_title") ? font2 : font, (String[]) Arrays.copyOf(strArr, 2), composerStartRestartGroup, 6);
                arrayList.add(lottieDynamicProperties3RememberLottieDynamicProperty);
                arrayList.add(lottieDynamicProperties3RememberLottieDynamicProperty2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LottieDynamicProperties3[] lottieDynamicProperties3Arr = (LottieDynamicProperties3[]) arrayList.toArray(new LottieDynamicProperties3[0]);
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme2.getColors(composerStartRestartGroup, i4).getJet(), null, 2, null)));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            Companion companion5 = INSTANCE;
            if (((Args) companion5.getArgs((Fragment) this)).getLocality().isRhsg() || Intrinsics.areEqual(((Args) companion5.getArgs((Fragment) this)).getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                bentoTheme = bentoTheme2;
                i2 = i4;
                companion = companion2;
                composerStartRestartGroup.startReplaceGroup(-1388636097);
                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(((Args) companion5.getArgs((Fragment) this)).getSplash().getHeaderImageUrl(), CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3), null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, modifierWeight$default, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1388141523);
                companion = companion2;
                bentoTheme = bentoTheme2;
                i2 = i4;
                LottieAnimation2.LottieAnimation(ComposeContent$lambda$4$lambda$3$lambda$2(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(((Args) companion5.getArgs((Fragment) this)).getSplash().getHeaderAnimationUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), modifierWeight$default, false, false, null, 0.0f, 0, false, false, false, null, false, false, LottieDynamicProperties2.rememberLottieDynamicProperties((LottieDynamicProperties3[]) Arrays.copyOf(lottieDynamicProperties3Arr, lottieDynamicProperties3Arr.length), composerStartRestartGroup, LottieDynamicProperties3.$stable), null, null, false, false, null, false, null, composerStartRestartGroup, 0, LottieDynamicProperties.$stable << 9, 0, 2088956);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i2).getJet(), 0.0f, composer2, 0, 5);
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), bentoTheme.getColors(composer2, i2).m21371getBg0d7_KjU(), null, 2, null), false, ComposableLambda3.rememberComposableLambda(-664013984, true, new MarginUpgradeSplashFragment4(this), composer2, 54), ComposableLambda3.rememberComposableLambda(-6066355, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$1$2
                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-6066355, i5, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MarginUpgradeSplashFragment.kt:154)");
                    }
                    ImmutableList3 persistentList = extensions2.toPersistentList(((MarginUpgradeSplashFragment.Args) MarginUpgradeSplashFragment.INSTANCE.getArgs((Fragment) this.this$0)).getSplash().getContent());
                    MarginUpgradeSplashFragment marginUpgradeSplashFragment = this.this$0;
                    composer3.startReplaceGroup(767440808);
                    SduiColumns.SduiLazyColumn(persistentList, GenericAction.class, Modifier.INSTANCE, LazyListStateKt.rememberLazyListState(0, 0, composer3, 0, 3), null, marginUpgradeSplashFragment, HorizontalPadding.Default, false, composer3, 0, 0);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                    invoke(boxScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 3456, 2);
            composer2.endNode();
            Composer composer3 = composer2;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(MarginUpgradeSplashFragment2.INSTANCE.getLambda$955972588$feature_margin_upgrade_externalDebug(), null, ComposableLambda3.rememberComposableLambda(589240384, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$2

                /* compiled from: MarginUpgradeSplashFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$2$1 */
                static final class C211361 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ BentoAppBarScope $this_BentoAppBar;
                    final /* synthetic */ MarginUpgradeSplashFragment this$0;

                    C211361(BentoAppBarScope bentoAppBarScope, MarginUpgradeSplashFragment marginUpgradeSplashFragment) {
                        this.$this_BentoAppBar = bentoAppBarScope;
                        this.this$0 = marginUpgradeSplashFragment;
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
                            ComposerKt.traceEventStart(-1701778642, i, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MarginUpgradeSplashFragment.kt:164)");
                        }
                        BentoAppBarScope bentoAppBarScope = this.$this_BentoAppBar;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final MarginUpgradeSplashFragment marginUpgradeSplashFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: CONSTRUCTOR (r1v2 'objRememberedValue' java.lang.Object) = (r0v2 'marginUpgradeSplashFragment' com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment A[DONT_INLINE]) A[MD:(com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment):void (m)] (LINE:165) call: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$2$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment):void type: CONSTRUCTOR in method: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$2.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes8.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r14 & 3
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r13.getSkipping()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r13.skipToGroupEnd()
                                return
                            L10:
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MarginUpgradeSplashFragment.kt:164)"
                                r2 = -1701778642(0xffffffff9a90eb2e, float:-5.993696E-23)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r14, r0, r1)
                            L1f:
                                com.robinhood.compose.bento.component.BentoAppBarScope r3 = r12.$this_BentoAppBar
                                r14 = 5004770(0x4c5de2, float:7.013177E-39)
                                r13.startReplaceGroup(r14)
                                com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment r14 = r12.this$0
                                boolean r14 = r13.changedInstance(r14)
                                com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment r0 = r12.this$0
                                java.lang.Object r1 = r13.rememberedValue()
                                if (r14 != 0) goto L3d
                                androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r14 = r14.getEmpty()
                                if (r1 != r14) goto L45
                            L3d:
                                com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$2$1$$ExternalSyntheticLambda0 r1 = new com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$2$1$$ExternalSyntheticLambda0
                                r1.<init>(r0)
                                r13.updateRememberedValue(r1)
                            L45:
                                r8 = r1
                                kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
                                r13.endReplaceGroup()
                                int r14 = com.robinhood.compose.bento.component.BentoAppBarScope.$stable
                                int r10 = r14 << 12
                                r11 = 7
                                r4 = 0
                                r5 = 0
                                r6 = 0
                                r9 = r13
                                r3.m20576BentoCloseButtoncf5BqRc(r4, r5, r6, r8, r9, r10, r11)
                                boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r13 == 0) goto L61
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L61:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment6.C211361.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(MarginUpgradeSplashFragment marginUpgradeSplashFragment) {
                            FragmentActivity fragmentActivityRequireActivity = marginUpgradeSplashFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                            NavigationActivityResultContract3.finishWithResult(fragmentActivityRequireActivity, new MarginUpgradeContract.Result.Canceled(true));
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                        invoke(bentoAppBarScope, composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | ((i5 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(589240384, i6, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment.ComposeContent.<anonymous>.<anonymous> (MarginUpgradeSplashFragment.kt:163)");
                        }
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1701778642, true, new C211361(BentoAppBar, this.this$0), composer4, 54), composer4, 805306368, 509);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, null, true, false, null, null, 0L, null, composer3, 196998, 0, 2010);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginUpgradeSplashFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        private static final LottieComposition ComposeContent$lambda$4$lambda$3$lambda$2(LottieCompositionResult lottieCompositionResult) {
            return lottieCompositionResult.getValue();
        }

        /* compiled from: MarginUpgradeSplashFragment.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Args;", "Landroid/os/Parcelable;", "splash", "Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getSplash", "()Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Args implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Args> CREATOR = new Creator();
            private final CountryCode.Supported locality;
            private final ApiMarginOnboardingSplash splash;

            /* compiled from: MarginUpgradeSplashFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Args> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Args((ApiMarginOnboardingSplash) parcel.readParcelable(Args.class.getClassLoader()), (CountryCode.Supported) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args[] newArray(int i) {
                    return new Args[i];
                }
            }

            public static /* synthetic */ Args copy$default(Args args, ApiMarginOnboardingSplash apiMarginOnboardingSplash, CountryCode.Supported supported, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiMarginOnboardingSplash = args.splash;
                }
                if ((i & 2) != 0) {
                    supported = args.locality;
                }
                return args.copy(apiMarginOnboardingSplash, supported);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiMarginOnboardingSplash getSplash() {
                return this.splash;
            }

            /* renamed from: component2, reason: from getter */
            public final CountryCode.Supported getLocality() {
                return this.locality;
            }

            public final Args copy(ApiMarginOnboardingSplash splash, CountryCode.Supported locality) {
                Intrinsics.checkNotNullParameter(splash, "splash");
                Intrinsics.checkNotNullParameter(locality, "locality");
                return new Args(splash, locality);
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
                return Intrinsics.areEqual(this.splash, args.splash) && Intrinsics.areEqual(this.locality, args.locality);
            }

            public int hashCode() {
                return (this.splash.hashCode() * 31) + this.locality.hashCode();
            }

            public String toString() {
                return "Args(splash=" + this.splash + ", locality=" + this.locality + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.splash, flags);
                dest.writeSerializable(this.locality);
            }

            public Args(ApiMarginOnboardingSplash splash, CountryCode.Supported locality) {
                Intrinsics.checkNotNullParameter(splash, "splash");
                Intrinsics.checkNotNullParameter(locality, "locality");
                this.splash = splash;
                this.locality = locality;
            }

            public final ApiMarginOnboardingSplash getSplash() {
                return this.splash;
            }

            public final CountryCode.Supported getLocality() {
                return this.locality;
            }
        }

        /* compiled from: MarginUpgradeSplashFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeSplashFragment, Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public Args getArgs(MarginUpgradeSplashFragment marginUpgradeSplashFragment) {
                return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeSplashFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
            public MarginUpgradeSplashFragment newInstance(Args args) {
                return (MarginUpgradeSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
            public void setArgs(MarginUpgradeSplashFragment marginUpgradeSplashFragment, Args args) {
                FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeSplashFragment, args);
            }
        }
    }
