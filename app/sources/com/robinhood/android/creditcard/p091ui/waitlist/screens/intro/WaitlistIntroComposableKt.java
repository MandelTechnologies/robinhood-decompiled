package com.robinhood.android.creditcard.p091ui.waitlist.screens.intro;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.view.ComponentActivity;
import androidx.view.compose.LocalActivity;
import com.google.common.collect.ImmutableMap;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.WaitlistIntroComposableKt;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WaitlistIntroComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\u001a§\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032 \u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\u0017\u0010 \u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0002\u0010!\u001a\u0017\u0010\"\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0002\u0010!\"\u000e\u0010\u001a\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u000e\u0010#\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006&²\u0006\n\u0010'\u001a\u00020\u001bX\u008a\u008e\u0002"}, m3636d2 = {"WaitlistIntro", "", "onClose", "Lkotlin/Function0;", "onJoin", "onTermsApply", "videos", "Lcom/google/common/collect/ImmutableMap;", "", "Lkotlin/Pair;", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroidx/media3/common/MediaItem;", "isLoading", "", "canApply", "hasValidCreditCard", "hasInvite", "referrerFirstName", "accountTabScrollInteraction", "Lcom/robinhood/android/redesigninvesting/interactions/scrolling/AccountTabScrollInteraction;", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "entryPointSource", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/google/common/collect/ImmutableMap;ZZZZLjava/lang/String;Lcom/robinhood/android/redesigninvesting/interactions/scrolling/AccountTabScrollInteraction;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "Headline", "(Landroidx/compose/runtime/Composer;I)V", "GRADIENT_OFFSET", "", "NAV_COLORS", "", "Landroidx/compose/ui/graphics/Color;", "[Landroidx/compose/ui/graphics/Color;", "genAcceptInviteSubtitle", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "genAcceptInviteDisclaimer", "WAITLIST_INTRO_CTA_TEST_TAG", "WAITLIST_INTRO_HEADLINE_TEST_TAG", "WAITLIST_INTRO_CLOSE_BUTTON_TEST_TAG", "feature-credit-card_externalDebug", "navBreakpoint"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class WaitlistIntroComposableKt {
    private static final int GRADIENT_OFFSET = 150;
    private static final Color[] NAV_COLORS;
    public static final String WAITLIST_INTRO_CLOSE_BUTTON_TEST_TAG = "waitlist-intro-close-button-test-tag";
    public static final String WAITLIST_INTRO_CTA_TEST_TAG = "waitlist-intro-cta-test-tag";
    public static final String WAITLIST_INTRO_HEADLINE_TEST_TAG = "waitlist-intro-headline-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Headline$lambda$7(int i, Composer composer, int i2) {
        Headline(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitlistIntro$lambda$5(Function0 function0, Function0 function02, Function0 function03, ImmutableMap immutableMap, boolean z, boolean z2, boolean z3, boolean z4, String str, AccountTabScrollInteractions accountTabScrollInteractions, AccountSelectorTabArgs accountSelectorTabArgs, String str2, int i, int i2, int i3, Composer composer, int i4) {
        WaitlistIntro(function0, function02, function03, immutableMap, z, z2, z3, z4, str, accountTabScrollInteractions, accountSelectorTabArgs, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WaitlistIntro(final Function0<Unit> function0, final Function0<Unit> onJoin, final Function0<Unit> onTermsApply, final ImmutableMap<String, Tuples2<MediaSource, MediaItem>> videos, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str, final AccountTabScrollInteractions accountTabScrollInteractions, AccountSelectorTabArgs accountSelectorTabArgs, String str2, Composer composer, final int i, final int i2, final int i3) {
        final Function0<Unit> function02;
        int i4;
        int i5;
        AccountSelectorTabArgs accountSelectorTabArgs2;
        int i6;
        int i7;
        String str3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotIntState2 snapshotIntState2;
        ComponentActivity componentActivity;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final String str4;
        final AccountSelectorTabArgs accountSelectorTabArgs3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onJoin, "onJoin");
        Intrinsics.checkNotNullParameter(onTermsApply, "onTermsApply");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Composer composerStartRestartGroup = composer.startRestartGroup(801335583);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i4 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onJoin) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onTermsApply) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(videos) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else {
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(str) ? 67108864 : 33554432;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(accountTabScrollInteractions) ? 536870912 : 268435456;
                        }
                        i5 = i3 & 1024;
                        if (i5 != 0) {
                            i6 = i2 | 6;
                            accountSelectorTabArgs2 = accountSelectorTabArgs;
                        } else {
                            accountSelectorTabArgs2 = accountSelectorTabArgs;
                            if ((i2 & 6) == 0) {
                                i6 = i2 | (composerStartRestartGroup.changedInstance(accountSelectorTabArgs2) ? 4 : 2);
                            } else {
                                i6 = i2;
                            }
                        }
                        i7 = i3 & 2048;
                        if (i7 != 0) {
                            i6 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
                        }
                        int i8 = i6;
                        if ((i4 & 306783379) == 306783378 && (i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            str4 = str2;
                            composer2 = composerStartRestartGroup;
                            accountSelectorTabArgs3 = accountSelectorTabArgs2;
                        } else {
                            if (i5 != 0) {
                                accountSelectorTabArgs2 = null;
                            }
                            String str5 = i7 == 0 ? null : str2;
                            if (ComposerKt.isTraceInProgress()) {
                                str3 = str5;
                            } else {
                                str3 = str5;
                                ComposerKt.traceEventStart(801335583, i4, i8, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro (WaitlistIntroComposable.kt:93)");
                            }
                            final List listMutableListOf = CollectionsKt.mutableListOf(0, 0, 0);
                            Object[] objArr = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WaitlistIntroComposableKt.WaitlistIntro$lambda$1$lambda$0();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                            loggingUtils.setCcScreen(new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null));
                            Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                            componentActivity = !(objConsume instanceof ComponentActivity) ? (ComponentActivity) objConsume : null;
                            Unit unit = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(componentActivity) | composerStartRestartGroup.changed(snapshotIntState2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new WaitlistIntroComposableKt$WaitlistIntro$1$1(componentActivity, snapshotIntState2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                            final String str6 = str3;
                            final AccountSelectorTabArgs accountSelectorTabArgs4 = accountSelectorTabArgs2;
                            composer2 = composerStartRestartGroup;
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, BentoColor.INSTANCE.m21143getCCGoldFG0d7_KjU(), 0L, 0L, Color.INSTANCE.m6716getBlack0d7_KjU(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-728071283, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt.WaitlistIntro.2

                                /* compiled from: WaitlistIntroComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $canApply;
                                    final /* synthetic */ String $entryPointSource;
                                    final /* synthetic */ boolean $hasInvite;
                                    final /* synthetic */ boolean $hasValidCreditCard;
                                    final /* synthetic */ boolean $isLoading;
                                    final /* synthetic */ Function0<Unit> $onJoin;

                                    AnonymousClass2(boolean z, boolean z2, boolean z3, String str, Function0<Unit> function0, boolean z4) {
                                        this.$hasValidCreditCard = z;
                                        this.$canApply = z2;
                                        this.$hasInvite = z3;
                                        this.$entryPointSource = str;
                                        this.$onJoin = function0;
                                        this.$isLoading = z4;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-786379564, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:130)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer.rememberedValue();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return WaitlistIntroComposableKt.C127392.AnonymousClass2.invoke$lambda$1$lambda$0((GraphicsLayerScope) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierFillMaxWidth$default, (Function1) objRememberedValue);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$2$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return WaitlistIntroComposableKt.C127392.AnonymousClass2.invoke$lambda$3$lambda$2((DrawScope) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierGraphicsLayer, (Function1) objRememberedValue2);
                                        final boolean z = this.$hasValidCreditCard;
                                        final boolean z2 = this.$canApply;
                                        final boolean z3 = this.$hasInvite;
                                        final String str = this.$entryPointSource;
                                        final Function0<Unit> function0 = this.$onJoin;
                                        final boolean z4 = this.$isLoading;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierDrawBehind);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        BentoColor bentoColor = BentoColor.INSTANCE;
                                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoColor.m21139getCCGoldBG0d7_KjU(), 0L, 0L, 0L, bentoColor.m21138getCCGoldAccent0d7_KjU(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1992412472, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$2$3$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i2) {
                                                String strStringResource;
                                                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1992412472, i2, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:146)");
                                                }
                                                if (z) {
                                                    composer2.startReplaceGroup(847033963);
                                                    strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_accept_open_credit_card_app, composer2, 0);
                                                    composer2.endReplaceGroup();
                                                } else if (z2) {
                                                    composer2.startReplaceGroup(847038692);
                                                    strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_accept_apply_now_cta, composer2, 0);
                                                    composer2.endReplaceGroup();
                                                } else if (z3) {
                                                    composer2.startReplaceGroup(847043233);
                                                    strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_accept_invite_cta, composer2, 0);
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    composer2.startReplaceGroup(847047511);
                                                    strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_reserve, composer2, 0);
                                                    composer2.endReplaceGroup();
                                                }
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), 0.0f, composer2, 0, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                                Screen screen = new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null);
                                                UserInteractionEventData.Action action = (z2 || z) ? UserInteractionEventData.Action.CONTINUE : z3 ? UserInteractionEventData.Action.ACCEPT : UserInteractionEventData.Action.JOIN_WAITLIST;
                                                String str2 = str;
                                                BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource, TestTag3.testTag(ModifiersKt.autoLogEvents$default(modifierM5144paddingVpY3zN4$default, new UserInteractionEventDescriptor(str, screen, action, str2 != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 32, null), false, false, false, true, false, null, 110, null), WaitlistIntroComposableKt.WAITLIST_INTRO_CTA_TEST_TAG), null, null, false, z4, null, null, null, null, false, null, composer2, 0, 0, 8120);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), composer, 805306368, 494);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(GraphicsLayerScope graphicsLayer) {
                                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                        graphicsLayer.setTranslationY(60.0f);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(DrawScope drawBehind) {
                                        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                                        Brush.Companion companion = Brush.INSTANCE;
                                        Float fValueOf = Float.valueOf(0.0f);
                                        BentoColor bentoColor = BentoColor.INSTANCE;
                                        DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(companion, new Tuples2[]{new Tuples2(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoColor.m21143getCCGoldFG0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(bentoColor.m21143getCCGoldFG0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-728071283, i9, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous> (WaitlistIntroComposable.kt:117)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Screen screen = new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null);
                                    String str7 = str6;
                                    Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(companion2, new UserInteractionEventDescriptor(null, screen, null, str7 != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null));
                                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU();
                                    int iM5856getCenterERTFSPs = FabPosition.INSTANCE.m5856getCenterERTFSPs();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-786379564, true, new AnonymousClass2(z3, z2, z4, str6, onJoin, z), composer3, 54);
                                    final AccountTabScrollInteractions accountTabScrollInteractions2 = accountTabScrollInteractions;
                                    final AccountSelectorTabArgs accountSelectorTabArgs5 = accountSelectorTabArgs4;
                                    final ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMap = videos;
                                    final List<Integer> list = listMutableListOf;
                                    final SnapshotIntState2 snapshotIntState22 = snapshotIntState2;
                                    final boolean z5 = z4;
                                    final String str8 = str;
                                    final Function0<Unit> function03 = onTermsApply;
                                    final Function0<Unit> function04 = function02;
                                    final String str9 = str6;
                                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions, null, null, null, composableLambdaRememberComposableLambda, iM5856getCenterERTFSPs, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(-1115329124, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt.WaitlistIntro.2.3
                                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i10) {
                                            int i11;
                                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                            if ((i10 & 6) == 0) {
                                                i11 = i10 | (composer4.changed(paddingValues) ? 4 : 2);
                                            } else {
                                                i11 = i10;
                                            }
                                            if ((i11 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1115329124, i11, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:191)");
                                            }
                                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                            AccountTabScrollInteractions accountTabScrollInteractions3 = accountTabScrollInteractions2;
                                            AccountSelectorTabArgs accountSelectorTabArgs6 = accountSelectorTabArgs5;
                                            ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMap2 = immutableMap;
                                            List<Integer> list2 = list;
                                            SnapshotIntState2 snapshotIntState23 = snapshotIntState22;
                                            boolean z6 = z5;
                                            String str10 = str8;
                                            Function0<Unit> function05 = function03;
                                            Function0<Unit> function06 = function04;
                                            String str11 = str9;
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer4, 0, 1);
                                            AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider(accountTabScrollInteractions3, accountSelectorTabArgs6, scrollStateRememberScrollState, ComposableLambda3.rememberComposableLambda(-459745560, true, new WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1(scrollStateRememberScrollState, accountSelectorTabArgs6, immutableMap2, list2, snapshotIntState23, z6, str10, function05, function06, str11), composer4, 54), composer4, 3072, 0);
                                            composer4.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                            invoke(paddingValues, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 805330944, 398);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, 805330944, 493);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str4 = str6;
                            accountSelectorTabArgs3 = accountSelectorTabArgs4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return WaitlistIntroComposableKt.WaitlistIntro$lambda$5(function0, onJoin, onTermsApply, videos, z, z2, z3, z4, str, accountTabScrollInteractions, accountSelectorTabArgs3, str4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i5 = i3 & 1024;
                    if (i5 != 0) {
                    }
                    i7 = i3 & 2048;
                    if (i7 != 0) {
                    }
                    int i82 = i6;
                    if ((i4 & 306783379) == 306783378) {
                        if (i5 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final List<Integer> listMutableListOf2 = CollectionsKt.mutableListOf(0, 0, 0);
                        Object[] objArr2 = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        loggingUtils.setCcScreen(new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null));
                        Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                        if (!(objConsume2 instanceof ComponentActivity)) {
                        }
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(componentActivity) | composerStartRestartGroup.changed(snapshotIntState2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new WaitlistIntroComposableKt$WaitlistIntro$1$1(componentActivity, snapshotIntState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                            final String str62 = str3;
                            final AccountSelectorTabArgs accountSelectorTabArgs42 = accountSelectorTabArgs2;
                            composer2 = composerStartRestartGroup;
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, BentoColor.INSTANCE.m21143getCCGoldFG0d7_KjU(), 0L, 0L, Color.INSTANCE.m6716getBlack0d7_KjU(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-728071283, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt.WaitlistIntro.2

                                /* compiled from: WaitlistIntroComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $canApply;
                                    final /* synthetic */ String $entryPointSource;
                                    final /* synthetic */ boolean $hasInvite;
                                    final /* synthetic */ boolean $hasValidCreditCard;
                                    final /* synthetic */ boolean $isLoading;
                                    final /* synthetic */ Function0<Unit> $onJoin;

                                    AnonymousClass2(boolean z, boolean z2, boolean z3, String str, Function0<Unit> function0, boolean z4) {
                                        this.$hasValidCreditCard = z;
                                        this.$canApply = z2;
                                        this.$hasInvite = z3;
                                        this.$entryPointSource = str;
                                        this.$onJoin = function0;
                                        this.$isLoading = z4;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-786379564, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:130)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer.rememberedValue();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return WaitlistIntroComposableKt.C127392.AnonymousClass2.invoke$lambda$1$lambda$0((GraphicsLayerScope) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierFillMaxWidth$default, (Function1) objRememberedValue);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$2$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return WaitlistIntroComposableKt.C127392.AnonymousClass2.invoke$lambda$3$lambda$2((DrawScope) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierGraphicsLayer, (Function1) objRememberedValue2);
                                        final boolean z = this.$hasValidCreditCard;
                                        final boolean z2 = this.$canApply;
                                        final boolean z3 = this.$hasInvite;
                                        final String str = this.$entryPointSource;
                                        final Function0<Unit> function0 = this.$onJoin;
                                        final boolean z4 = this.$isLoading;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierDrawBehind);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        final BoxScope boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        BentoColor bentoColor = BentoColor.INSTANCE;
                                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoColor.m21139getCCGoldBG0d7_KjU(), 0L, 0L, 0L, bentoColor.m21138getCCGoldAccent0d7_KjU(), 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1992412472, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$2$3$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i2) {
                                                String strStringResource;
                                                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1992412472, i2, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:146)");
                                                }
                                                if (z) {
                                                    composer2.startReplaceGroup(847033963);
                                                    strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_accept_open_credit_card_app, composer2, 0);
                                                    composer2.endReplaceGroup();
                                                } else if (z2) {
                                                    composer2.startReplaceGroup(847038692);
                                                    strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_accept_apply_now_cta, composer2, 0);
                                                    composer2.endReplaceGroup();
                                                } else if (z3) {
                                                    composer2.startReplaceGroup(847043233);
                                                    strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_accept_invite_cta, composer2, 0);
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    composer2.startReplaceGroup(847047511);
                                                    strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_reserve, composer2, 0);
                                                    composer2.endReplaceGroup();
                                                }
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), 0.0f, composer2, 0, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                                Screen screen = new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null);
                                                UserInteractionEventData.Action action = (z2 || z) ? UserInteractionEventData.Action.CONTINUE : z3 ? UserInteractionEventData.Action.ACCEPT : UserInteractionEventData.Action.JOIN_WAITLIST;
                                                String str2 = str;
                                                BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource, TestTag3.testTag(ModifiersKt.autoLogEvents$default(modifierM5144paddingVpY3zN4$default, new UserInteractionEventDescriptor(str, screen, action, str2 != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 32, null), false, false, false, true, false, null, 110, null), WaitlistIntroComposableKt.WAITLIST_INTRO_CTA_TEST_TAG), null, null, false, z4, null, null, null, null, false, null, composer2, 0, 0, 8120);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), composer, 805306368, 494);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(GraphicsLayerScope graphicsLayer) {
                                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                        graphicsLayer.setTranslationY(60.0f);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(DrawScope drawBehind) {
                                        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                                        Brush.Companion companion = Brush.INSTANCE;
                                        Float fValueOf = Float.valueOf(0.0f);
                                        BentoColor bentoColor = BentoColor.INSTANCE;
                                        DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(companion, new Tuples2[]{new Tuples2(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoColor.m21143getCCGoldFG0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(bentoColor.m21143getCCGoldFG0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-728071283, i9, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous> (WaitlistIntroComposable.kt:117)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Screen screen = new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null);
                                    String str7 = str62;
                                    Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(companion2, new UserInteractionEventDescriptor(null, screen, null, str7 != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null));
                                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU();
                                    int iM5856getCenterERTFSPs = FabPosition.INSTANCE.m5856getCenterERTFSPs();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-786379564, true, new AnonymousClass2(z3, z2, z4, str62, onJoin, z), composer3, 54);
                                    final AccountTabScrollInteractions accountTabScrollInteractions2 = accountTabScrollInteractions;
                                    final AccountSelectorTabArgs accountSelectorTabArgs5 = accountSelectorTabArgs42;
                                    final ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMap = videos;
                                    final List<Integer> list = listMutableListOf2;
                                    final SnapshotIntState2 snapshotIntState22 = snapshotIntState2;
                                    final boolean z5 = z4;
                                    final String str8 = str;
                                    final Function0<Unit> function03 = onTermsApply;
                                    final Function0<Unit> function04 = function02;
                                    final String str9 = str62;
                                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions, null, null, null, composableLambdaRememberComposableLambda, iM5856getCenterERTFSPs, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(-1115329124, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt.WaitlistIntro.2.3
                                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i10) {
                                            int i11;
                                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                            if ((i10 & 6) == 0) {
                                                i11 = i10 | (composer4.changed(paddingValues) ? 4 : 2);
                                            } else {
                                                i11 = i10;
                                            }
                                            if ((i11 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1115329124, i11, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:191)");
                                            }
                                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                            AccountTabScrollInteractions accountTabScrollInteractions3 = accountTabScrollInteractions2;
                                            AccountSelectorTabArgs accountSelectorTabArgs6 = accountSelectorTabArgs5;
                                            ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMap2 = immutableMap;
                                            List<Integer> list2 = list;
                                            SnapshotIntState2 snapshotIntState23 = snapshotIntState22;
                                            boolean z6 = z5;
                                            String str10 = str8;
                                            Function0<Unit> function05 = function03;
                                            Function0<Unit> function06 = function04;
                                            String str11 = str9;
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer4, 0, 1);
                                            AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider(accountTabScrollInteractions3, accountSelectorTabArgs6, scrollStateRememberScrollState, ComposableLambda3.rememberComposableLambda(-459745560, true, new WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1(scrollStateRememberScrollState, accountSelectorTabArgs6, immutableMap2, list2, snapshotIntState23, z6, str10, function05, function06, str11), composer4, 54), composer4, 3072, 0);
                                            composer4.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                            invoke(paddingValues, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 805330944, 398);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, 805330944, 493);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            str4 = str62;
                            accountSelectorTabArgs3 = accountSelectorTabArgs42;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 512) != 0) {
                }
                i5 = i3 & 1024;
                if (i5 != 0) {
                }
                i7 = i3 & 2048;
                if (i7 != 0) {
                }
                int i822 = i6;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i5 = i3 & 1024;
            if (i5 != 0) {
            }
            i7 = i3 & 2048;
            if (i7 != 0) {
            }
            int i8222 = i6;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i5 = i3 & 1024;
        if (i5 != 0) {
        }
        i7 = i3 & 2048;
        if (i7 != 0) {
        }
        int i82222 = i6;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 WaitlistIntro$lambda$1$lambda$0() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WaitlistIntro$setNavBreakpoint(List<Integer> list, SnapshotIntState2 snapshotIntState2, int i, boolean z) {
        int iSumOfInt = CollectionsKt.sumOfInt(list);
        list.set(i, Integer.valueOf(z ? 1 : 0));
        int iSumOfInt2 = CollectionsKt.sumOfInt(list);
        if (iSumOfInt != iSumOfInt2) {
            snapshotIntState2.setIntValue(iSumOfInt2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Headline(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-854733745);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-854733745, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.Headline (WaitlistIntroComposable.kt:294)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoColor bentoColor = BentoColor.INSTANCE;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Background3.m4872backgroundbw27NRU$default(companion, bentoColor.m21142getCCGoldBGLight0d7_KjU(), null, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_headline, composerStartRestartGroup, 0);
            int i2 = C12201R.font.itc_garamond_std_book_condensed;
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, C2002Dp.m7995constructorimpl(88), 1, null), 0.0f, composerStartRestartGroup, 6, 1), WAITLIST_INTRO_HEADLINE_TEST_TAG), Color.m6701boximpl(bentoColor.m21139getCCGoldBG0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, new TextStyle(0L, TextUnit2.getSp(50), companion3.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i2, companion3.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(-1), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(60), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), composer2, 0, 0, 8120);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WaitlistIntroComposableKt.Headline$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static {
        BentoColor bentoColor = BentoColor.INSTANCE;
        NAV_COLORS = new Color[]{Color.m6701boximpl(bentoColor.m21143getCCGoldFG0d7_KjU()), Color.m6701boximpl(bentoColor.m21139getCCGoldBG0d7_KjU())};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String genAcceptInviteSubtitle(String str, Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        composer.startReplaceGroup(81705578);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(81705578, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.genAcceptInviteSubtitle (WaitlistIntroComposable.kt:328)");
        }
        if (str != null) {
            composer.startReplaceGroup(-1155452649);
            strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_accept_invite_subtitle, new Object[]{str}, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1155350814);
            strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_accept_invite_subtitle_no_name, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String genAcceptInviteDisclaimer(String str, Composer composer, int i) throws Resources.NotFoundException {
        composer.startReplaceGroup(-1703355769);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703355769, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.genAcceptInviteDisclaimer (WaitlistIntroComposable.kt:337)");
        }
        int i2 = C12201R.string.waitlist_intro_accept_invite_disclaimer;
        if (str == null) {
            str = "your friend";
        }
        String strStringResource = StringResources_androidKt.stringResource(i2, new Object[]{str}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }
}
