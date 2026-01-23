package com.robinhood.android.matcha.p177ui.profile;

import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoader;
import coil.compose.LocalImageLoader;
import coil.compose.LocalImageLoader2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.block.MatchaBlockConfirmationDialog;
import com.robinhood.android.matcha.p177ui.profile.MatchaProfileViewState;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MatchaProfileComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u0016\u001a\u0087\u0001\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u001b\u001a\u00ad\u0001\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001f0\u001e2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010#\u001a\u00020\u00152\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010(\"\u000e\u0010)\u001a\u00020*X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"ProfileScreen", "", "viewState", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "imageLoader", "Lcoil/ImageLoader;", "onPayButtonClick", "Lkotlin/Function0;", "onRequestButtonClick", "onBlockActionConfirmed", "onBlockActionCancelled", "onBlockedBannerCtaClick", "onOverflowMenuClick", "onCloseClick", "onDismissErrorAlert", "(Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ProfileTopAppBar", "showOverflowMenu", "", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ProfileContent", "modifier", "Landroidx/compose/ui/Modifier;", "state", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MatchaProfileComposable", "sduiComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "isUserBlocked", "isPayButtonVisible", "isRequestButtonVisible", "showBlockConfirmationDialog", "userFullName", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcoil/ImageLoader;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "MatchaProfilePlaceholderComposable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "AVATAR_PLACEHOLDER_SIZE", "", "PRIMARY_TEXT_PLACEHOLDER", "SECONDARY_TEXT_PLACEHOLDER", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaProfileComposable3 {
    private static final int AVATAR_PLACEHOLDER_SIZE = 108;
    private static final String PRIMARY_TEXT_PLACEHOLDER = "XXXXX XXXXXX";
    private static final String SECONDARY_TEXT_PLACEHOLDER = "XXXXXX XXXXXXXXX";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaProfileComposable$lambda$4(Modifier modifier, List list, ImageLoader imageLoader, SduiActionHandler sduiActionHandler, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, boolean z4, Function0 function03, Function0 function04, Function0 function05, String str, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        MatchaProfileComposable(modifier, list, imageLoader, sduiActionHandler, z, z2, z3, function0, function02, z4, function03, function04, function05, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaProfilePlaceholderComposable$lambda$5(Modifier modifier, int i, Composer composer, int i2) {
        MatchaProfilePlaceholderComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileContent$lambda$2(Modifier modifier, MatchaProfileViewState matchaProfileViewState, SduiActionHandler sduiActionHandler, ImageLoader imageLoader, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i, Composer composer, int i2) throws Resources.NotFoundException {
        ProfileContent(modifier, matchaProfileViewState, sduiActionHandler, imageLoader, function0, function02, function03, function04, function05, function06, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$0(MatchaProfileViewState matchaProfileViewState, SduiActionHandler sduiActionHandler, ImageLoader imageLoader, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, int i, int i2, Composer composer, int i3) {
        ProfileScreen(matchaProfileViewState, sduiActionHandler, imageLoader, function0, function02, function03, function04, function05, function06, function07, function08, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileTopAppBar$lambda$1(boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ProfileTopAppBar(z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ProfileScreen(final MatchaProfileViewState viewState, final SduiActionHandler<? super GenericAction> actionHandler, final ImageLoader imageLoader, final Function0<Unit> onPayButtonClick, final Function0<Unit> onRequestButtonClick, final Function0<Unit> onBlockActionConfirmed, final Function0<Unit> onBlockActionCancelled, final Function0<Unit> onBlockedBannerCtaClick, final Function0<Unit> onOverflowMenuClick, final Function0<Unit> onCloseClick, final Function0<Unit> onDismissErrorAlert, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onPayButtonClick, "onPayButtonClick");
        Intrinsics.checkNotNullParameter(onRequestButtonClick, "onRequestButtonClick");
        Intrinsics.checkNotNullParameter(onBlockActionConfirmed, "onBlockActionConfirmed");
        Intrinsics.checkNotNullParameter(onBlockActionCancelled, "onBlockActionCancelled");
        Intrinsics.checkNotNullParameter(onBlockedBannerCtaClick, "onBlockedBannerCtaClick");
        Intrinsics.checkNotNullParameter(onOverflowMenuClick, "onOverflowMenuClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onDismissErrorAlert, "onDismissErrorAlert");
        Composer composerStartRestartGroup = composer.startRestartGroup(1936018751);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(imageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPayButtonClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRequestButtonClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBlockActionConfirmed) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBlockActionCancelled) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBlockedBannerCtaClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOverflowMenuClick) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onDismissErrorAlert) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1936018751, i3, i4, "com.robinhood.android.matcha.ui.profile.ProfileScreen (MatchaProfileComposable.kt:61)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5625Scaffold27mzLpw(null, null, ComposableLambda3.rememberComposableLambda(1192023748, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt.ProfileScreen.1
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
                        ComposerKt.traceEventStart(1192023748, i6, -1, "com.robinhood.android.matcha.ui.profile.ProfileScreen.<anonymous> (MatchaProfileComposable.kt:66)");
                    }
                    MatchaProfileComposable3.ProfileTopAppBar(viewState.getShowOverflowMenu(), onOverflowMenuClick, onCloseClick, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), ComposableLambda3.rememberComposableLambda(-1486536067, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt.ProfileScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486536067, i6, -1, "com.robinhood.android.matcha.ui.profile.ProfileScreen.<anonymous> (MatchaProfileComposable.kt:73)");
                    }
                    MatchaProfileComposable3.ProfileContent(PaddingKt.padding(Modifier.INSTANCE, paddingValues), viewState, actionHandler, imageLoader, onPayButtonClick, onRequestButtonClick, onBlockActionConfirmed, onBlockActionCancelled, onBlockedBannerCtaClick, onDismissErrorAlert, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 384, 12582912, 32763);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaProfileComposable3.ProfileScreen$lambda$0(viewState, actionHandler, imageLoader, onPayButtonClick, onRequestButtonClick, onBlockActionConfirmed, onBlockActionCancelled, onBlockedBannerCtaClick, onOverflowMenuClick, onCloseClick, onDismissErrorAlert, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ProfileTopAppBar(final boolean z, final Function0<Unit> onOverflowMenuClick, final Function0<Unit> onCloseClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onOverflowMenuClick, "onOverflowMenuClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(654394213);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOverflowMenuClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(654394213, i2, -1, "com.robinhood.android.matcha.ui.profile.ProfileTopAppBar (MatchaProfileComposable.kt:93)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(MatchaProfileComposable.INSTANCE.m16367getLambda$2029177582$feature_p2p_externalDebug(), null, ComposableLambda3.rememberComposableLambda(100799334, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt.ProfileTopAppBar.1
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
                        ComposerKt.traceEventStart(100799334, i3, -1, "com.robinhood.android.matcha.ui.profile.ProfileTopAppBar.<anonymous> (MatchaProfileComposable.kt:96)");
                    }
                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, onCloseClick, composer3, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1420625017, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt.ProfileTopAppBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1420625017, i3, -1, "com.robinhood.android.matcha.ui.profile.ProfileTopAppBar.<anonymous> (MatchaProfileComposable.kt:100)");
                    }
                    if (z) {
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.DOTS_ANDROID_24);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(size24, null, bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU(), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i4).m21593getSmallD9Ej5fM(), 0.0f, 2, null), onOverflowMenuClick, false, composer3, BentoIcon4.Size24.$stable | 48, 32);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaProfileComposable3.ProfileTopAppBar$lambda$1(z, onOverflowMenuClick, onCloseClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ProfileContent(Modifier modifier, MatchaProfileViewState state, final SduiActionHandler<? super GenericAction> actionHandler, final ImageLoader imageLoader, final Function0<Unit> onPayButtonClick, final Function0<Unit> onRequestButtonClick, final Function0<Unit> onBlockActionConfirmed, final Function0<Unit> onBlockActionCancelled, final Function0<Unit> onBlockedBannerCtaClick, final Function0<Unit> onDismissErrorAlert, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Modifier modifier2;
        Composer composer2;
        MatchaProfileViewState matchaProfileViewState;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onPayButtonClick, "onPayButtonClick");
        Intrinsics.checkNotNullParameter(onRequestButtonClick, "onRequestButtonClick");
        Intrinsics.checkNotNullParameter(onBlockActionConfirmed, "onBlockActionConfirmed");
        Intrinsics.checkNotNullParameter(onBlockActionCancelled, "onBlockActionCancelled");
        Intrinsics.checkNotNullParameter(onBlockedBannerCtaClick, "onBlockedBannerCtaClick");
        Intrinsics.checkNotNullParameter(onDismissErrorAlert, "onDismissErrorAlert");
        Composer composerStartRestartGroup = composer.startRestartGroup(524658925);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(imageLoader) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPayButtonClick) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRequestButtonClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBlockActionConfirmed) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBlockActionCancelled) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBlockedBannerCtaClick) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissErrorAlert) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(524658925, i2, -1, "com.robinhood.android.matcha.ui.profile.ProfileContent (MatchaProfileComposable.kt:125)");
            }
            if (state instanceof MatchaProfileViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(728543819);
                MatchaProfileViewState.Loaded loaded = (MatchaProfileViewState.Loaded) state;
                int i3 = i2 << 9;
                MatchaProfileComposable(modifier, loaded.getSduiComponents(), imageLoader, actionHandler, loaded.isUserBlocked(), loaded.isPayButtonVisible(), loaded.isRequestButtonVisible(), onPayButtonClick, onRequestButtonClick, loaded.getShowBlockConfirmationDialog(), onBlockActionConfirmed, onBlockActionCancelled, onBlockedBannerCtaClick, loaded.getUserFullName(), composerStartRestartGroup, (i3 & 234881024) | ((i2 >> 3) & 896) | (i2 & 14) | ((i2 << 3) & 7168) | (i3 & 29360128), (i2 >> 18) & 1022);
                modifier2 = modifier;
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                matchaProfileViewState = state;
            } else {
                modifier2 = modifier;
                composer2 = composerStartRestartGroup;
                matchaProfileViewState = state;
                if (matchaProfileViewState instanceof MatchaProfileViewState.Loading) {
                    composer2.startReplaceGroup(1686098041);
                    MatchaProfilePlaceholderComposable(modifier2, composer2, i2 & 14);
                    composer2.endReplaceGroup();
                } else {
                    if (!(matchaProfileViewState instanceof MatchaProfileViewState.Error)) {
                        composer2.startReplaceGroup(1686068105);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(729530828);
                    MatchaProfilePlaceholderComposable(modifier2, composer2, i2 & 14);
                    MatchaProfileViewState.Error error = (MatchaProfileViewState.Error) matchaProfileViewState;
                    BentoAlertDialog.BentoAlertDialog(error.getTitle(), error.getBody(), new BentoAlertButton(error.getAlertPrimaryButtonText(), onDismissErrorAlert), null, null, ServerToBentoAssetMapper3.WARNING, false, null, onDismissErrorAlert, composer2, (BentoAlertDialog2.Body.$stable << 3) | 196608 | (BentoAlertButton.$stable << 6) | ((i2 >> 3) & 234881024), EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                    composer2.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
            matchaProfileViewState = state;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final MatchaProfileViewState matchaProfileViewState2 = matchaProfileViewState;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaProfileComposable3.ProfileContent$lambda$2(modifier3, matchaProfileViewState2, actionHandler, imageLoader, onPayButtonClick, onRequestButtonClick, onBlockActionConfirmed, onBlockActionCancelled, onBlockedBannerCtaClick, onDismissErrorAlert, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MatchaProfileComposable(final Modifier modifier, final List<? extends UIComponent<? extends GenericAction>> sduiComponents, final ImageLoader imageLoader, final SduiActionHandler<? super GenericAction> actionHandler, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> onPayButtonClick, final Function0<Unit> onRequestButtonClick, final boolean z4, final Function0<Unit> onBlockActionConfirmed, final Function0<Unit> onBlockActionCancelled, final Function0<Unit> onBlockedBannerCtaClick, final String userFullName, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        int i4;
        Composer composer2;
        int i5;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(sduiComponents, "sduiComponents");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onPayButtonClick, "onPayButtonClick");
        Intrinsics.checkNotNullParameter(onRequestButtonClick, "onRequestButtonClick");
        Intrinsics.checkNotNullParameter(onBlockActionConfirmed, "onBlockActionConfirmed");
        Intrinsics.checkNotNullParameter(onBlockActionCancelled, "onBlockActionCancelled");
        Intrinsics.checkNotNullParameter(onBlockedBannerCtaClick, "onBlockedBannerCtaClick");
        Intrinsics.checkNotNullParameter(userFullName, "userFullName");
        Composer composerStartRestartGroup = composer.startRestartGroup(618754073);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sduiComponents) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(imageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPayButtonClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRequestButtonClick) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z4) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onBlockActionConfirmed) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBlockActionCancelled) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBlockedBannerCtaClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(userFullName) ? 2048 : 1024;
        }
        int i7 = i4;
        if ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(618754073, i6, i7, "com.robinhood.android.matcha.ui.profile.MatchaProfileComposable (MatchaProfileComposable.kt:177)");
            }
            composerStartRestartGroup.startReplaceGroup(1917195954);
            if (z4) {
                int i8 = i7 << 6;
                composer2 = composerStartRestartGroup;
                MatchaBlockConfirmationDialog.MatchaBlockConfirmationDialog(z, userFullName, onBlockActionConfirmed, onBlockActionCancelled, composer2, ((i6 >> 12) & 14) | ((i7 >> 6) & 112) | (i8 & 896) | (i8 & 7168));
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            final Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(1846402734);
            if (z) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                i5 = 6;
                BentoInfoBanner2.BentoUrgentInfoBanner(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), 2, null), StringResources_androidKt.stringResource(C21284R.string.matcha_profile_blocked_user_message, composer2, 0), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24), StringResources_androidKt.stringResource(C21284R.string.matcha_profile_unblock_action, composer2, 0), onBlockedBannerCtaClick, composer2, (BentoIcon4.Size24.$stable << 6) | (57344 & (i7 << 6)), 0);
            } else {
                i5 = 6;
            }
            composer2.endReplaceGroup();
            CompositionLocal3.CompositionLocalProvider(LocalImageLoader.m9117providesimpl(LocalImageLoader2.getLocalImageLoader(), imageLoader), ComposableLambda3.rememberComposableLambda(-1202358449, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt$MatchaProfileComposable$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10) {
                    if ((i10 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1202358449, i10, -1, "com.robinhood.android.matcha.ui.profile.MatchaProfileComposable.<anonymous>.<anonymous> (MatchaProfileComposable.kt:205)");
                    }
                    ImmutableList3 persistentList = extensions2.toPersistentList(sduiComponents);
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                    SduiActionHandler<GenericAction> sduiActionHandler = actionHandler;
                    composer3.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierVerticalScroll$default, null, sduiActionHandler, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 100663296, 0);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21372getBg20d7_KjU(), 0.0f, composer2, 0, 5);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1692052134, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt$MatchaProfileComposable$1$2
                /* JADX WARN: Type inference failed for: r0v1 */
                /* JADX WARN: Type inference failed for: r0v2, types: [com.robinhood.compose.bento.component.BentoButtons$Icon$Position, kotlin.jvm.internal.DefaultConstructorMarker] */
                /* JADX WARN: Type inference failed for: r0v6 */
                public final void invoke(Composer composer3, int i10) {
                    ?? r0;
                    Row6 row6;
                    Modifier.Companion companion2;
                    boolean z5;
                    Function0<Unit> function0;
                    if ((i10 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1692052134, i10, -1, "com.robinhood.android.matcha.ui.profile.MatchaProfileComposable.<anonymous>.<anonymous> (MatchaProfileComposable.kt:218)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i11 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer3, i11).m21593getSmallD9Ej5fM());
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme2.getSpacing(composer3, i11).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i11).m21590getDefaultD9Ej5fM());
                    boolean z6 = z2;
                    Function0<Unit> function02 = onPayButtonClick;
                    boolean z7 = z3;
                    Function0<Unit> function03 = onRequestButtonClick;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composer3.startReplaceGroup(-1687524874);
                    if (z6) {
                        row6 = row62;
                        companion2 = companion3;
                        z5 = z7;
                        function0 = function03;
                        r0 = 0;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_pay, composer3, 0), Row5.weight$default(row62, companion3, 1.0f, false, 2, null), new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.WITHDRAW_24, null, 2, null), null, false, false, null, null, null, null, false, null, composer3, BentoButtons.Icon.Size16.$stable << 9, 0, 8176);
                    } else {
                        r0 = 0;
                        row6 = row62;
                        companion2 = companion3;
                        z5 = z7;
                        function0 = function03;
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1687512287);
                    if (z5) {
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_request, composer3, 0), Row5.weight$default(row6, companion2, 1.0f, false, 2, null), new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.DEPOSIT_24, r0, 2, r0), null, false, false, null, null, null, null, false, null, composer3, BentoButtons.Icon.Size16.$stable << 9, 0, 8176);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, i5);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaProfileComposable3.MatchaProfileComposable$lambda$4(modifier, sduiComponents, imageLoader, actionHandler, z, z2, z3, onPayButtonClick, onRequestButtonClick, z4, onBlockActionConfirmed, onBlockActionCancelled, onBlockedBannerCtaClick, userFullName, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MatchaProfilePlaceholderComposable(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1330490997);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1330490997, i2, -1, "com.robinhood.android.matcha.ui.profile.MatchaProfilePlaceholderComposable (MatchaProfileComposable.kt:247)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(232116731, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt.MatchaProfilePlaceholderComposable.1
                public final void invoke(Composer composer2, int i3) {
                    Composer composer3 = composer2;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(232116731, i3, -1, "com.robinhood.android.matcha.ui.profile.MatchaProfilePlaceholderComposable.<anonymous> (MatchaProfileComposable.kt:248)");
                    }
                    Modifier modifier2 = modifier;
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifier2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BoxKt.Box(column6.align(SizeKt.m5169size3ABfNKs(ModifiersKt.bentoCirclePlaceholder(companion3, true), C2002Dp.m7995constructorimpl(108)), companion.getCenterHorizontally()), composer3, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM()), composer3, 0);
                    BentoText2.m20747BentoText38GnDrw(MatchaProfileComposable3.PRIMARY_TEXT_PLACEHOLDER, column6.align(companion3, companion.getCenterHorizontally()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getDisplayCapsuleLarge(), composer3, 6, 0, 8188);
                    int i5 = 0;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i4).m21592getMediumD9Ej5fM()), composer3, 0);
                    composer3.startReplaceGroup(550688853);
                    while (i5 < 3) {
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.PERSON, null, null, 6, null), MatchaProfileComposable3.PRIMARY_TEXT_PLACEHOLDER, MatchaProfileComposable3.SECONDARY_TEXT_PLACEHOLDER, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer3, BentoBaseRowState.$stable << 3, 125);
                        i5++;
                        composer3 = composer2;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaProfileComposable3.MatchaProfilePlaceholderComposable$lambda$5(modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
