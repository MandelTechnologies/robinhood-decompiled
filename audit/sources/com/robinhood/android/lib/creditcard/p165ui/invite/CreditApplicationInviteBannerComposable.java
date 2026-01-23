package com.robinhood.android.lib.creditcard.p165ui.invite;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.lib.creditcard.C20264R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CreditApplicationInviteBannerComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"InviteBanner", "", "location", "Lcom/robinhood/android/lib/creditcard/ui/invite/Location;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "large", "", "duxo", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerDuxo;", "(Lcom/robinhood/android/lib/creditcard/ui/invite/Location;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerDuxo;Landroidx/compose/runtime/Composer;II)V", "INVITE_BANNER_ROOT_TEST_TAG", "", "INVITE_BANNER_TITLE_TEST_TAG", "INVITE_BANNER_SUBTITLE_TEST_TAG", "INVITE_BANNER_CTA_TEST_TAG", "INVITE_BANNER_ICON_TEST_TAG", "feature-lib-credit-card_externalDebug", "viewState", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CreditApplicationInviteBannerComposable {
    public static final String INVITE_BANNER_CTA_TEST_TAG = "invite-banner-cta-test-tag";
    public static final String INVITE_BANNER_ICON_TEST_TAG = "invite-banner-icon-test-tag";
    public static final String INVITE_BANNER_ROOT_TEST_TAG = "invite-banner-root-test-tag";
    public static final String INVITE_BANNER_SUBTITLE_TEST_TAG = "invite-banner-subtitle-test-tag";
    public static final String INVITE_BANNER_TITLE_TEST_TAG = "invite-banner-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteBanner$lambda$3(CreditApplicationInviteBannerDuxo4 creditApplicationInviteBannerDuxo4, Modifier modifier, Function0 function0, boolean z, CreditApplicationInviteBannerDuxo creditApplicationInviteBannerDuxo, int i, int i2, Composer composer, int i3) {
        InviteBanner(creditApplicationInviteBannerDuxo4, modifier, function0, z, creditApplicationInviteBannerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InviteBanner(final CreditApplicationInviteBannerDuxo4 location, Modifier modifier, Function0<Unit> function0, boolean z, CreditApplicationInviteBannerDuxo creditApplicationInviteBannerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        boolean z2;
        CreditApplicationInviteBannerDuxo creditApplicationInviteBannerDuxo2;
        final Modifier modifier3;
        final Function0<Unit> function03;
        Composer composer2;
        int i6;
        final CreditApplicationInviteBannerDuxo creditApplicationInviteBannerDuxo3;
        final boolean z3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final boolean z4;
        final Modifier modifier4;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(location, "location");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1307586473);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(location.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            creditApplicationInviteBannerDuxo2 = creditApplicationInviteBannerDuxo;
                            int i8 = composerStartRestartGroup.changedInstance(creditApplicationInviteBannerDuxo2) ? 16384 : 8192;
                            i3 |= i8;
                        } else {
                            creditApplicationInviteBannerDuxo2 = creditApplicationInviteBannerDuxo;
                        }
                        i3 |= i8;
                    } else {
                        creditApplicationInviteBannerDuxo2 = creditApplicationInviteBannerDuxo;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier3 = modifier2;
                            function03 = function02;
                            creditApplicationInviteBannerDuxo3 = creditApplicationInviteBannerDuxo2;
                            composer2 = composerStartRestartGroup;
                            i6 = i3;
                            z3 = z2;
                        } else {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function03 = (Function0) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function03 = function02;
                            }
                            boolean z5 = i5 == 0 ? false : z2;
                            if ((i2 & 16) == 0) {
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
                                composer2 = composerStartRestartGroup;
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CreditApplicationInviteBannerDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                                composer2.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt$InviteBanner$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt$InviteBanner$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                                composer2.endReplaceGroup();
                                creditApplicationInviteBannerDuxo3 = (CreditApplicationInviteBannerDuxo) baseDuxo;
                                i6 = i3 & (-57345);
                            } else {
                                composer2 = composerStartRestartGroup;
                                i6 = i3;
                                creditApplicationInviteBannerDuxo3 = creditApplicationInviteBannerDuxo2;
                            }
                            z3 = z5;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1307586473, i6, -1, "com.robinhood.android.lib.creditcard.ui.invite.InviteBanner (CreditApplicationInviteBannerComposable.kt:53)");
                        }
                        Composer composer4 = composer2;
                        AnimatedVisibilityKt.AnimatedVisibility(CreditApplicationInviteBannerDuxo.INSTANCE.shouldShowBanner(InviteBanner$lambda$2(FlowExtKt.collectAsStateWithLifecycle(creditApplicationInviteBannerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7)), location), (Modifier) null, EnterExitTransitionKt.slideInVertically$default(null, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, Alignment.INSTANCE.getTop(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(null, 0.3f, 1, null)), EnterExitTransitionKt.slideOutVertically$default(null, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(-1022141825, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt.InviteBanner.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                invoke(animatedVisibilityScope, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i9) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1022141825, i9, -1, "com.robinhood.android.lib.creditcard.ui.invite.InviteBanner.<anonymous> (CreditApplicationInviteBannerComposable.kt:60)");
                                }
                                final Modifier modifier5 = modifier3;
                                final Function0<Unit> function05 = function03;
                                final boolean z6 = z3;
                                final CreditApplicationInviteBannerDuxo4 creditApplicationInviteBannerDuxo4 = location;
                                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1215892025, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt.InviteBanner.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i10) {
                                        Painter painterPainterResource;
                                        Modifier.Companion companion;
                                        BentoTheme bentoTheme;
                                        int i11;
                                        if ((i10 & 3) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1215892025, i10, -1, "com.robinhood.android.lib.creditcard.ui.invite.InviteBanner.<anonymous>.<anonymous> (CreditApplicationInviteBannerComposable.kt:61)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i12 = BentoTheme.$stable;
                                        float f = 8;
                                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer6, i12).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer6, i12).m21590getDefaultD9Ej5fM(), 7, null), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer6, i12).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), false, null, null, function05, 7, null), 0.0f, C2002Dp.m7995constructorimpl(z6 ? 200.0f : 130.0f), 1, null), CreditApplicationInviteBannerComposable.INVITE_BANNER_ROOT_TEST_TAG), new UserInteractionEventDescriptor(null, ((UserInteractionEventDescriptor) composer6.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen(), null, null, new Component(Component.ComponentType.FEATURE_CARD, CreditApplicationInviteBannerDuxo.INSTANCE.getLoggingIdentifier(creditApplicationInviteBannerDuxo4), null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
                                        boolean z7 = z6;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Horizontal start = arrangement.getStart();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer6, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierAutoLogEvents$default);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        Modifier modifierClip = Clip.clip(row6.align(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), companion2.getBottom()), RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null));
                                        if (z7) {
                                            composer6.startReplaceGroup(1612180917);
                                            painterPainterResource = PainterResources_androidKt.painterResource(C20264R.drawable.credit_card_half_large, composer6, 0);
                                            composer6.endReplaceGroup();
                                        } else {
                                            composer6.startReplaceGroup(1612291835);
                                            painterPainterResource = PainterResources_androidKt.painterResource(C20264R.drawable.credit_card_half, composer6, 0);
                                            composer6.endReplaceGroup();
                                        }
                                        ImageKt.Image(painterPainterResource, (String) null, modifierClip, (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24624, 104);
                                        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(row6.align(PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme2.getSpacing(composer6, i12).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically()), 0.0f, C2002Dp.m7995constructorimpl(190.0f), 1, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer6, 48);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM5176widthInVpY3zN4$default);
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor2);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), CreditApplicationInviteBannerComposable.INVITE_BANNER_TITLE_TEST_TAG);
                                        String strStringResource = StringResources_androidKt.stringResource(C20264R.string.credit_application_invite_banner_title, composer6, 0);
                                        TextStyle textM = bentoTheme2.getTypography(composer6, i12).getTextM();
                                        FontWeight.Companion companion5 = FontWeight.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer6, 24624, 0, 8172);
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C20264R.string.credit_application_invite_banner_details, composer6, 0), TestTag3.testTag(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), CreditApplicationInviteBannerComposable.INVITE_BANNER_SUBTITLE_TEST_TAG), Color.m6701boximpl(bentoTheme2.getColors(composer6, i12).m21426getFg20d7_KjU()), null, companion5.getLight(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer6, i12).getTextS(), composer6, 24624, 0, 8168);
                                        composer6.startReplaceGroup(-601806976);
                                        if (z7) {
                                            companion = companion4;
                                            bentoTheme = bentoTheme2;
                                            i11 = i12;
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C20264R.string.credit_application_invite_banner_cta, composer6, 0), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer6, i12).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), CreditApplicationInviteBannerComposable.INVITE_BANNER_CTA_TEST_TAG), null, null, companion5.getBold(), TextDecoration.INSTANCE.getUnderline(), null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer6, i12).getTextS(), composer6, 221184, 0, 8140);
                                        } else {
                                            companion = companion4;
                                            bentoTheme = bentoTheme2;
                                            i11 = i12;
                                        }
                                        composer6.endReplaceGroup();
                                        composer6.endNode();
                                        composer6.startReplaceGroup(1160457124);
                                        if (!z7) {
                                            int i13 = i11;
                                            Modifier modifierTestTag2 = TestTag3.testTag(row6.align(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer6, i13).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically()), CreditApplicationInviteBannerComposable.INVITE_BANNER_ICON_TEST_TAG);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer6, 48);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer6, modifierTestTag2);
                                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                            if (composer6.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor3);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer6);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer6, i13).m21425getFg0d7_KjU(), null, null, false, composer6, BentoIcon4.Size24.$stable | 48, 56);
                                            composer6.endNode();
                                        }
                                        composer6.endReplaceGroup();
                                        composer6.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), composer5, 100663296, 255);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54), composer4, 200064, 18);
                        composer3 = composer4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function0<Unit> function05 = function03;
                        z4 = z3;
                        modifier4 = modifier3;
                        function04 = function05;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        function04 = function02;
                        z4 = z2;
                        creditApplicationInviteBannerDuxo3 = creditApplicationInviteBannerDuxo2;
                        composer3 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CreditApplicationInviteBannerComposable.InviteBanner$lambda$3(location, modifier4, function04, z4, creditApplicationInviteBannerDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                z2 = z;
                if ((i & 24576) != 0) {
                }
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        z3 = z5;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Composer composer42 = composer2;
                        AnimatedVisibilityKt.AnimatedVisibility(CreditApplicationInviteBannerDuxo.INSTANCE.shouldShowBanner(InviteBanner$lambda$2(FlowExtKt.collectAsStateWithLifecycle(creditApplicationInviteBannerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7)), location), (Modifier) null, EnterExitTransitionKt.slideInVertically$default(null, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, Alignment.INSTANCE.getTop(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(null, 0.3f, 1, null)), EnterExitTransitionKt.slideOutVertically$default(null, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(-1022141825, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt.InviteBanner.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                invoke(animatedVisibilityScope, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i9) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1022141825, i9, -1, "com.robinhood.android.lib.creditcard.ui.invite.InviteBanner.<anonymous> (CreditApplicationInviteBannerComposable.kt:60)");
                                }
                                final Modifier modifier5 = modifier3;
                                final Function0<Unit> function052 = function03;
                                final boolean z6 = z3;
                                final CreditApplicationInviteBannerDuxo4 creditApplicationInviteBannerDuxo4 = location;
                                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1215892025, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerComposableKt.InviteBanner.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i10) {
                                        Painter painterPainterResource;
                                        Modifier.Companion companion;
                                        BentoTheme bentoTheme;
                                        int i11;
                                        if ((i10 & 3) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1215892025, i10, -1, "com.robinhood.android.lib.creditcard.ui.invite.InviteBanner.<anonymous>.<anonymous> (CreditApplicationInviteBannerComposable.kt:61)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i12 = BentoTheme.$stable;
                                        float f = 8;
                                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer6, i12).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer6, i12).m21590getDefaultD9Ej5fM(), 7, null), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer6, i12).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), false, null, null, function052, 7, null), 0.0f, C2002Dp.m7995constructorimpl(z6 ? 200.0f : 130.0f), 1, null), CreditApplicationInviteBannerComposable.INVITE_BANNER_ROOT_TEST_TAG), new UserInteractionEventDescriptor(null, ((UserInteractionEventDescriptor) composer6.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen(), null, null, new Component(Component.ComponentType.FEATURE_CARD, CreditApplicationInviteBannerDuxo.INSTANCE.getLoggingIdentifier(creditApplicationInviteBannerDuxo4), null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
                                        boolean z7 = z6;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Horizontal start = arrangement.getStart();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer6, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierAutoLogEvents$default);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        Modifier modifierClip = Clip.clip(row6.align(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), companion2.getBottom()), RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null));
                                        if (z7) {
                                            composer6.startReplaceGroup(1612180917);
                                            painterPainterResource = PainterResources_androidKt.painterResource(C20264R.drawable.credit_card_half_large, composer6, 0);
                                            composer6.endReplaceGroup();
                                        } else {
                                            composer6.startReplaceGroup(1612291835);
                                            painterPainterResource = PainterResources_androidKt.painterResource(C20264R.drawable.credit_card_half, composer6, 0);
                                            composer6.endReplaceGroup();
                                        }
                                        ImageKt.Image(painterPainterResource, (String) null, modifierClip, (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24624, 104);
                                        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(row6.align(PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme2.getSpacing(composer6, i12).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically()), 0.0f, C2002Dp.m7995constructorimpl(190.0f), 1, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer6, 48);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM5176widthInVpY3zN4$default);
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor2);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), CreditApplicationInviteBannerComposable.INVITE_BANNER_TITLE_TEST_TAG);
                                        String strStringResource = StringResources_androidKt.stringResource(C20264R.string.credit_application_invite_banner_title, composer6, 0);
                                        TextStyle textM = bentoTheme2.getTypography(composer6, i12).getTextM();
                                        FontWeight.Companion companion5 = FontWeight.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer6, 24624, 0, 8172);
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C20264R.string.credit_application_invite_banner_details, composer6, 0), TestTag3.testTag(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), CreditApplicationInviteBannerComposable.INVITE_BANNER_SUBTITLE_TEST_TAG), Color.m6701boximpl(bentoTheme2.getColors(composer6, i12).m21426getFg20d7_KjU()), null, companion5.getLight(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer6, i12).getTextS(), composer6, 24624, 0, 8168);
                                        composer6.startReplaceGroup(-601806976);
                                        if (z7) {
                                            companion = companion4;
                                            bentoTheme = bentoTheme2;
                                            i11 = i12;
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C20264R.string.credit_application_invite_banner_cta, composer6, 0), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer6, i12).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), CreditApplicationInviteBannerComposable.INVITE_BANNER_CTA_TEST_TAG), null, null, companion5.getBold(), TextDecoration.INSTANCE.getUnderline(), null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer6, i12).getTextS(), composer6, 221184, 0, 8140);
                                        } else {
                                            companion = companion4;
                                            bentoTheme = bentoTheme2;
                                            i11 = i12;
                                        }
                                        composer6.endReplaceGroup();
                                        composer6.endNode();
                                        composer6.startReplaceGroup(1160457124);
                                        if (!z7) {
                                            int i13 = i11;
                                            Modifier modifierTestTag2 = TestTag3.testTag(row6.align(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer6, i13).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically()), CreditApplicationInviteBannerComposable.INVITE_BANNER_ICON_TEST_TAG);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer6, 48);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer6, modifierTestTag2);
                                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                            if (composer6.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor3);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer6);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer6, i13).m21425getFg0d7_KjU(), null, null, false, composer6, BentoIcon4.Size24.$stable | 48, 56);
                                            composer6.endNode();
                                        }
                                        composer6.endReplaceGroup();
                                        composer6.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), composer5, 100663296, 255);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer42, 54), composer42, 200064, 18);
                        composer3 = composer42;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Function0<Unit> function052 = function03;
                        z4 = z3;
                        modifier4 = modifier3;
                        function04 = function052;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i & 24576) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CreditApplicationInviteState InviteBanner$lambda$2(SnapshotState4<CreditApplicationInviteState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
