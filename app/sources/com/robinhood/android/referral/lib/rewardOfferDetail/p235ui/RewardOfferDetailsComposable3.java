package com.robinhood.android.referral.lib.rewardOfferDetail.p235ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.referral.lib.C26709R;
import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetails;
import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetailsSectionViewType;
import com.robinhood.android.referral.lib.rewardOfferDetail.p235ui.RewardOfferDetailsComposable3;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import com.robinhood.models.serverdriven.api.ApiThemedImageSource;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RewardOfferDetailsComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0012\u001aQ\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0019\u001a\u00020\u0015X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"RewardOfferDetailsComposable", "", "content", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;", "onBackClicked", "Lkotlin/Function0;", "onBulletActionClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;", "onPastRewardsClicked", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "modifier", "Landroidx/compose/ui/Modifier;", "hidePastRewardButton", "", "(Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "TopBarComposable", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "BottomBarComposable", "identifier", "", WiresInvalidAccountContentComposable.PrimaryButtonTag, WiresInvalidAccountContentComposable.SecondaryButtonTag, "(Ljava/lang/String;Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "backButtonTag", "feature-lib-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardOfferDetailsComposable3 {
    public static final String backButtonTag = "backButton";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$9(String str, ApiRewardOfferButtonAction apiRewardOfferButtonAction, ApiRewardOfferButtonAction apiRewardOfferButtonAction2, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        BottomBarComposable(str, apiRewardOfferButtonAction, apiRewardOfferButtonAction2, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardOfferDetailsComposable$lambda$0(RewardOfferDetails rewardOfferDetails, Function0 function0, Function1 function1, Function0 function02, Function1 function12, Function1 function13, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        RewardOfferDetailsComposable(rewardOfferDetails, function0, function1, function02, function12, function13, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarComposable$lambda$1(Function0 function0, Function0 function02, boolean z, int i, Composer composer, int i2) {
        TopBarComposable(function0, function02, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RewardOfferDetailsComposable(final RewardOfferDetails content, final Function0<Unit> onBackClicked, final Function1<? super ApiRewardOfferButtonAction, Unit> onBulletActionClicked, final Function0<Unit> onPastRewardsClicked, final Function1<? super ApiRewardOfferButtonAction, Unit> onPrimaryButtonClicked, final Function1<? super ApiRewardOfferButtonAction, Unit> onSecondaryButtonClicked, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onBulletActionClicked, "onBulletActionClicked");
        Intrinsics.checkNotNullParameter(onPastRewardsClicked, "onPastRewardsClicked");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClicked, "onPrimaryButtonClicked");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClicked, "onSecondaryButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1342899393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBulletActionClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPastRewardsClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClicked) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClicked) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    final boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1342899393, i3, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposable (RewardOfferDetailsComposable.kt:53)");
                    }
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    boolean z5 = z4;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), ComposableLambda3.rememberComposableLambda(-686035973, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt.RewardOfferDetailsComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-686035973, i6, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposable.<anonymous> (RewardOfferDetailsComposable.kt:57)");
                            }
                            RewardOfferDetailsComposable3.TopBarComposable(onBackClicked, onPastRewardsClicked, z4, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-803672742, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt.RewardOfferDetailsComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-803672742, i6, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposable.<anonymous> (RewardOfferDetailsComposable.kt:64)");
                            }
                            String string2 = content.getId().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            RewardOfferDetailsComposable3.BottomBarComposable(string2, content.getPrimaryButton(), content.getSecondaryButton(), onPrimaryButtonClicked, onSecondaryButtonClicked, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(1614413392, true, new C267353(content, onBulletActionClicked), composerStartRestartGroup, 54), composer2, 805306800, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z3 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RewardOfferDetailsComposable3.RewardOfferDetailsComposable$lambda$0(content, onBackClicked, onBulletActionClicked, onPastRewardsClicked, onPrimaryButtonClicked, onSecondaryButtonClicked, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            z2 = z;
            if ((4793491 & i3) != 4793490) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                boolean z52 = z4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), ComposableLambda3.rememberComposableLambda(-686035973, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt.RewardOfferDetailsComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-686035973, i6, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposable.<anonymous> (RewardOfferDetailsComposable.kt:57)");
                        }
                        RewardOfferDetailsComposable3.TopBarComposable(onBackClicked, onPastRewardsClicked, z4, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-803672742, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt.RewardOfferDetailsComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-803672742, i6, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposable.<anonymous> (RewardOfferDetailsComposable.kt:64)");
                        }
                        String string2 = content.getId().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        RewardOfferDetailsComposable3.BottomBarComposable(string2, content.getPrimaryButton(), content.getSecondaryButton(), onPrimaryButtonClicked, onSecondaryButtonClicked, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(1614413392, true, new C267353(content, onBulletActionClicked), composerStartRestartGroup, 54), composer2, 805306800, 440);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                z3 = z52;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        z2 = z;
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: RewardOfferDetailsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3 */
    static final class C267353 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ RewardOfferDetails $content;
        final /* synthetic */ Function1<ApiRewardOfferButtonAction, Unit> $onBulletActionClicked;

        /* JADX WARN: Multi-variable type inference failed */
        C267353(RewardOfferDetails rewardOfferDetails, Function1<? super ApiRewardOfferButtonAction, Unit> function1) {
            this.$content = rewardOfferDetails;
            this.$onBulletActionClicked = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614413392, i2, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposable.<anonymous> (RewardOfferDetailsComposable.kt:74)");
            }
            List<RewardOfferDetailsSectionViewType> viewTypes = this.$content.getViewTypes();
            final ArrayList arrayList = new ArrayList();
            for (Object obj : viewTypes) {
                if (!(((RewardOfferDetailsSectionViewType) obj) instanceof RewardOfferDetailsSectionViewType.Unsupported)) {
                    arrayList.add(obj);
                }
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(arrayList) | composer.changed(this.$onBulletActionClicked);
            final Function1<ApiRewardOfferButtonAction, Unit> function1 = this.$onBulletActionClicked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RewardOfferDetailsComposable3.C267353.invoke$lambda$6$lambda$5(arrayList, function1, (LazyListScope) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierPadding, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(final List list, final Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final C26728x622399e0 c26728x622399e0 = new Function1() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3$invoke$lambda$6$lambda$5$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(RewardOfferDetailsSectionViewType rewardOfferDetailsSectionViewType) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((RewardOfferDetailsSectionViewType) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3$invoke$lambda$6$lambda$5$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c26728x622399e0.invoke(list.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3$invoke$lambda$6$lambda$5$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final RewardOfferDetailsSectionViewType rewardOfferDetailsSectionViewType = (RewardOfferDetailsSectionViewType) list.get(i);
                    composer.startReplaceGroup(-1760286444);
                    if (rewardOfferDetailsSectionViewType instanceof RewardOfferDetailsSectionViewType.AnimatedHeader) {
                        composer.startReplaceGroup(-1760317228);
                        RewardOfferDetailAnimatedHeaderComposable.RewardOfferDetailAnimatedHeaderComposable(((RewardOfferDetailsSectionViewType.AnimatedHeader) rewardOfferDetailsSectionViewType).getData(), composer, 0);
                        composer.endReplaceGroup();
                    } else if (rewardOfferDetailsSectionViewType instanceof RewardOfferDetailsSectionViewType.ImageHeader) {
                        composer.startReplaceGroup(-1760085193);
                        RewardOfferDetailImageHeaderComposable.RewardOfferDetailImageHeaderComposable(((RewardOfferDetailsSectionViewType.ImageHeader) rewardOfferDetailsSectionViewType).getData(), composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        BentoValuePropRow2.Pog pog = null;
                        if (rewardOfferDetailsSectionViewType instanceof RewardOfferDetailsSectionViewType.MarqueeRow) {
                            composer.startReplaceGroup(-1759850864);
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 1, null);
                            List<ApiThemedImageSource> icons = ((RewardOfferDetailsSectionViewType.MarqueeRow) rewardOfferDetailsSectionViewType).getData().getIcons();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(icons, 10));
                            Iterator<T> it = icons.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ApiThemedImageSource) it.next()).toDbModel());
                            }
                            MarqueeRowComposable.MarqueeRowComposable(extensions2.toImmutableList(arrayList), modifierM5144paddingVpY3zN4$default, composer, 0, 0);
                            composer.endReplaceGroup();
                        } else if (rewardOfferDetailsSectionViewType instanceof RewardOfferDetailsSectionViewType.Bullet) {
                            composer.startReplaceGroup(-1759369992);
                            RewardOfferDetailsSectionViewType.Bullet bullet = (RewardOfferDetailsSectionViewType.Bullet) rewardOfferDetailsSectionViewType;
                            String bullet_image = bullet.getData().getBullet_image();
                            if (bullet_image != null) {
                                if (!StringsKt.startsWith(bullet_image, "http", true) && (serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(bullet_image)) != null) {
                                    pog = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
                                }
                                if (pog == null) {
                                }
                                String display_title = bullet.getData().getDisplay_title();
                                final Function1 function12 = function1;
                                BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(display_title, ComposableLambda3.rememberComposableLambda(-1564820018, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3$1$1$1$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i4) {
                                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1564820018, i4, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RewardOfferDetailsComposable.kt:117)");
                                        }
                                        composer2.startReplaceGroup(-553481460);
                                        RewardOfferDetailsSectionViewType rewardOfferDetailsSectionViewType2 = rewardOfferDetailsSectionViewType;
                                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                        RewardOfferDetailsSectionViewType.Bullet bullet2 = (RewardOfferDetailsSectionViewType.Bullet) rewardOfferDetailsSectionViewType2;
                                        builder.append(bullet2.getData().getDisplay_subtitle());
                                        composer2.startReplaceGroup(-553477526);
                                        if (bullet2.getData().getButton() != null) {
                                            builder.append(PlaceholderUtils.XXShortPlaceholderText);
                                            int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                                            try {
                                                builder.append(StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer2, 0));
                                                Unit unit = Unit.INSTANCE;
                                            } finally {
                                                builder.pop(iPushStyle);
                                            }
                                        }
                                        composer2.endReplaceGroup();
                                        AnnotatedString annotatedString = builder.toAnnotatedString();
                                        composer2.endReplaceGroup();
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        composer2.startReplaceGroup(-1633490746);
                                        boolean zChanged = composer2.changed(rewardOfferDetailsSectionViewType) | composer2.changed(function12);
                                        final RewardOfferDetailsSectionViewType rewardOfferDetailsSectionViewType3 = rewardOfferDetailsSectionViewType;
                                        final Function1<ApiRewardOfferButtonAction, Unit> function13 = function12;
                                        Object objRememberedValue = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3$1$1$1$2$1$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    ApiRewardOfferButtonAction button = ((RewardOfferDetailsSectionViewType.Bullet) rewardOfferDetailsSectionViewType3).getData().getButton();
                                                    if (button != null) {
                                                        function13.invoke(button);
                                                    }
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue);
                                        }
                                        composer2.endReplaceGroup();
                                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer2, 0, 0, 16380);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), pog, BentoValuePropRow.Top, null, null, composer, (BentoValuePropRow2.Pog.$stable << 6) | 3120, 48);
                                composer.endReplaceGroup();
                            } else {
                                pog = new BentoValuePropRow2.Pog(ServerToBentoAssetMapper3.SPARKLE);
                                String display_title2 = bullet.getData().getDisplay_title();
                                final Function1<? super ApiRewardOfferButtonAction, Unit> function122 = function1;
                                BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(display_title2, ComposableLambda3.rememberComposableLambda(-1564820018, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3$1$1$1$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i4) {
                                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1564820018, i4, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RewardOfferDetailsComposable.kt:117)");
                                        }
                                        composer2.startReplaceGroup(-553481460);
                                        RewardOfferDetailsSectionViewType rewardOfferDetailsSectionViewType2 = rewardOfferDetailsSectionViewType;
                                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                        RewardOfferDetailsSectionViewType.Bullet bullet2 = (RewardOfferDetailsSectionViewType.Bullet) rewardOfferDetailsSectionViewType2;
                                        builder.append(bullet2.getData().getDisplay_subtitle());
                                        composer2.startReplaceGroup(-553477526);
                                        if (bullet2.getData().getButton() != null) {
                                            builder.append(PlaceholderUtils.XXShortPlaceholderText);
                                            int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                                            try {
                                                builder.append(StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer2, 0));
                                                Unit unit = Unit.INSTANCE;
                                            } finally {
                                                builder.pop(iPushStyle);
                                            }
                                        }
                                        composer2.endReplaceGroup();
                                        AnnotatedString annotatedString = builder.toAnnotatedString();
                                        composer2.endReplaceGroup();
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        composer2.startReplaceGroup(-1633490746);
                                        boolean zChanged = composer2.changed(rewardOfferDetailsSectionViewType) | composer2.changed(function122);
                                        final RewardOfferDetailsSectionViewType rewardOfferDetailsSectionViewType3 = rewardOfferDetailsSectionViewType;
                                        final Function1<? super ApiRewardOfferButtonAction, Unit> function13 = function122;
                                        Object objRememberedValue = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$RewardOfferDetailsComposable$3$1$1$1$2$1$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    ApiRewardOfferButtonAction button = ((RewardOfferDetailsSectionViewType.Bullet) rewardOfferDetailsSectionViewType3).getData().getButton();
                                                    if (button != null) {
                                                        function13.invoke(button);
                                                    }
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue);
                                        }
                                        composer2.endReplaceGroup();
                                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer2, 0, 0, 16380);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), pog, BentoValuePropRow.Top, null, null, composer, (BentoValuePropRow2.Pog.$stable << 6) | 3120, 48);
                                composer.endReplaceGroup();
                            }
                        } else if (rewardOfferDetailsSectionViewType instanceof RewardOfferDetailsSectionViewType.Disclosure) {
                            composer.startReplaceGroup(-1757102032);
                            RichText data = ((RewardOfferDetailsSectionViewType.Disclosure) rewardOfferDetailsSectionViewType).getData();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15958toAnnotatedStringV23IgeMak(data, bentoTheme.getColors(composer, i4).m21426getFg20d7_KjU(), (LinkInteractionListener) null, composer, 0, 2), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i4).getTextS(), bentoTheme.getColors(composer, i4).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer, 0, 0, 8188);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(774620294);
                            composer.endReplaceGroup();
                            throw new Standard2("Unknown view data type: " + rewardOfferDetailsSectionViewType);
                        }
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBarComposable(final Function0<Unit> function0, final Function0<Unit> function02, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1391849277);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1391849277, i2, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.TopBarComposable (RewardOfferDetailsComposable.kt:168)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(RewardOfferDetailsComposable.INSTANCE.m18039getLambda$992363600$feature_lib_referral_externalDebug(), null, ComposableLambda3.rememberComposableLambda(35445212, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt.TopBarComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(35445212, i3, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.TopBarComposable.<anonymous> (RewardOfferDetailsComposable.kt:171)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "backButton"), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i3 << 12) & 57344), 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1462370395, true, new C267392(z, function02), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardOfferDetailsComposable3.TopBarComposable$lambda$1(function0, function02, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RewardOfferDetailsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$TopBarComposable$2 */
    static final class C267392 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ boolean $hidePastRewardButton;
        final /* synthetic */ Function0<Unit> $onPastRewardsClicked;

        C267392(boolean z, Function0<Unit> function0) {
            this.$hidePastRewardButton = z;
            this.$onPastRewardsClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1462370395, i, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.TopBarComposable.<anonymous> (RewardOfferDetailsComposable.kt:178)");
            }
            if (!this.$hidePastRewardButton) {
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$onPastRewardsClicked);
                final Function0<Unit> function0 = this.$onPastRewardsClicked;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$TopBarComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RewardOfferDetailsComposable3.C267392.invoke$lambda$1$lambda$0(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26709R.string.reward_offers_past_invites_text, composer, 0), ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8188);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void BottomBarComposable(final String str, final ApiRewardOfferButtonAction apiRewardOfferButtonAction, final ApiRewardOfferButtonAction apiRewardOfferButtonAction2, final Function1<? super ApiRewardOfferButtonAction, Unit> function1, final Function1<? super ApiRewardOfferButtonAction, Unit> function12, Composer composer, final int i) {
        int i2;
        int i3;
        Object obj;
        Modifier.Companion companion;
        int i4;
        ?? r2;
        boolean z;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1524467064);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(apiRewardOfferButtonAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(apiRewardOfferButtonAction2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1524467064, i2, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.BottomBarComposable (RewardOfferDetailsComposable.kt:199)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1917497657);
            if (apiRewardOfferButtonAction == null) {
                i4 = i2;
                i3 = i5;
                z = false;
                companion = companion2;
                r2 = 1;
                composer2 = composerStartRestartGroup;
                obj = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(apiRewardOfferButtonAction);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RewardOfferDetailsComposable3.BottomBarComposable$lambda$8$lambda$4$lambda$3$lambda$2(function1, apiRewardOfferButtonAction);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i5;
                obj = null;
                companion = companion2;
                i4 = i2;
                r2 = 1;
                z = false;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, apiRewardOfferButtonAction.getDisplay_text(), SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion2, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OFFER_PRIMARY_CTA, null, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, 43, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1917471972);
            if (apiRewardOfferButtonAction2 == null) {
                composer3 = composer2;
            } else {
                String display_text = apiRewardOfferButtonAction2.getDisplay_text();
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OFFER_SECONDARY_CTA, null, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, 43, null), true, false, false, true, false, null, 108, null), 0.0f, r2, obj), 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer2.changedInstance(apiRewardOfferButtonAction2) | ((i4 & 57344) == 16384 ? r2 : z);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RewardOfferDetailsComposable3.BottomBarComposable$lambda$8$lambda$7$lambda$6$lambda$5(function12, apiRewardOfferButtonAction2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, display_text, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailsComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RewardOfferDetailsComposable3.BottomBarComposable$lambda$9(str, apiRewardOfferButtonAction, apiRewardOfferButtonAction2, function1, function12, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$8$lambda$4$lambda$3$lambda$2(Function1 function1, ApiRewardOfferButtonAction apiRewardOfferButtonAction) {
        function1.invoke(apiRewardOfferButtonAction);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$8$lambda$7$lambda$6$lambda$5(Function1 function1, ApiRewardOfferButtonAction apiRewardOfferButtonAction) {
        function1.invoke(apiRewardOfferButtonAction);
        return Unit.INSTANCE;
    }
}
