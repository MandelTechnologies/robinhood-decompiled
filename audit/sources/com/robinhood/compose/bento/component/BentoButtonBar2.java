package com.robinhood.compose.bento.component;

import android.annotation.SuppressLint;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoButtonBar.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\n\u001aÑ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001b\u001a;\u0010\u001c\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001d\u001a\u0089\u0001\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010 \u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"BentoButtonBar", "", "state", "Lcom/robinhood/compose/bento/component/BentoButtonBarState;", "modifier", "Landroidx/compose/ui/Modifier;", "inlineLinkTextOnClick", "Lkotlin/Function0;", "primaryButtonOnClick", "secondaryButtonOnClick", "(Lcom/robinhood/compose/bento/component/BentoButtonBarState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "helperText", "", "inlineLinkText", "animateTextChanges", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "primaryButtonText", "primaryButtonLoading", "primaryButtonIcon", "Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "primaryButtonEnabled", "secondaryButtonText", "secondaryButtonLoading", "secondaryButtonIcon", "secondaryButtonEnabled", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;ZLandroidx/compose/runtime/Composer;III)V", "HelperText", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "ButtonStack", "(Landroidx/compose/foundation/gestures/Orientation;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;ZLandroidx/compose/runtime/Composer;III)V", BentoButtonBar2.BentoButtonBarTestTagPrimaryButton, BentoButtonBar2.BentoButtonBarTestTagSecondaryButton, BentoButtonBar2.BentoButtonBarTestTagHelperText, BentoButtonBar2.BentoButtonBarTestTagHelperTextWithLink, BentoButtonBar2.BentoButtonBarTestTagAnimatedHelperTextWithLink, "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoButtonBarKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoButtonBar2 {
    public static final String BentoButtonBarTestTagAnimatedHelperTextWithLink = "BentoButtonBarTestTagAnimatedHelperTextWithLink";
    public static final String BentoButtonBarTestTagHelperText = "BentoButtonBarTestTagHelperText";
    public static final String BentoButtonBarTestTagHelperTextWithLink = "BentoButtonBarTestTagHelperTextWithLink";
    public static final String BentoButtonBarTestTagPrimaryButton = "BentoButtonBarTestTagPrimaryButton";
    public static final String BentoButtonBarTestTagSecondaryButton = "BentoButtonBarTestTagSecondaryButton";

    /* compiled from: BentoButtonBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoButtonBarKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoButtonBar$lambda$0(BentoButtonBarState bentoButtonBarState, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i, int i2, Composer composer, int i3) {
        BentoButtonBar(bentoButtonBarState, modifier, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoButtonBar$lambda$2(Modifier modifier, String str, String str2, boolean z, Function0 function0, Orientation orientation, Function0 function02, String str3, boolean z2, BentoButtons.Icon.Size16 size16, boolean z3, Function0 function03, String str4, boolean z4, BentoButtons.Icon.Size16 size162, boolean z5, int i, int i2, int i3, Composer composer, int i4) {
        BentoButtonBar(modifier, str, str2, z, function0, orientation, function02, str3, z2, size16, z3, function03, str4, z4, size162, z5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonStack$lambda$7(Orientation orientation, String str, Function0 function0, boolean z, BentoButtons.Icon.Size16 size16, boolean z2, Function0 function02, String str2, boolean z3, BentoButtons.Icon.Size16 size162, boolean z4, int i, int i2, int i3, Composer composer, int i4) {
        ButtonStack(orientation, str, function0, z, size16, z2, function02, str2, z3, size162, z4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelperText$lambda$3(String str, String str2, Function0 function0, boolean z, int i, int i2, Composer composer, int i3) {
        HelperText(str, str2, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoButtonBar(final BentoButtonBarState state, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function04;
        int i5;
        Function0<Unit> function05;
        int i6;
        Function0<Unit> function06;
        Composer composer2;
        final Modifier modifier3;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        final Function0<Unit> function09;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-828865335);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
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
                    function04 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function05 = function02;
                        i3 |= composerStartRestartGroup.changedInstance(function05) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            function06 = function03;
                            i3 |= composerStartRestartGroup.changedInstance(function06) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            function07 = function04;
                            function08 = function05;
                            function09 = function06;
                        } else {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                function04 = null;
                            }
                            Function0<Unit> function010 = i5 == 0 ? null : function05;
                            Function0<Unit> function011 = i6 == 0 ? null : function06;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-828865335, i3, -1, "com.robinhood.compose.bento.component.BentoButtonBar (BentoButtonBar.kt:27)");
                            }
                            Function0<Unit> function012 = function04;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier5 = modifier4;
                            BentoButtonBar(modifier5, state.getHelperText(), state.getInlineLinkText(), state.getAnimateTextChanges(), function012, state.getOrientation(), function010, state.getPrimaryButtonText(), state.getPrimaryButtonLoading(), state.getPrimaryButtonIcon(), state.getPrimaryButtonEnabled(), function011, state.getSecondaryButtonText(), state.getSecondaryButtonLoading(), state.getSecondaryButtonIcon(), state.getSecondaryButtonEnabled(), composer2, ((i3 >> 3) & 14) | (57344 & (i3 << 6)) | ((i3 << 9) & 3670016), (i3 >> 9) & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            function07 = function012;
                            function08 = function010;
                            function09 = function011;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonBarKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoButtonBar2.BentoButtonBar$lambda$0(state, modifier3, function07, function08, function09, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    function06 = function03;
                    if ((i3 & 9363) == 9362) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Function0<Unit> function0122 = function04;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier52 = modifier4;
                        BentoButtonBar(modifier52, state.getHelperText(), state.getInlineLinkText(), state.getAnimateTextChanges(), function0122, state.getOrientation(), function010, state.getPrimaryButtonText(), state.getPrimaryButtonLoading(), state.getPrimaryButtonIcon(), state.getPrimaryButtonEnabled(), function011, state.getSecondaryButtonText(), state.getSecondaryButtonLoading(), state.getSecondaryButtonIcon(), state.getSecondaryButtonEnabled(), composer2, ((i3 >> 3) & 14) | (57344 & (i3 << 6)) | ((i3 << 9) & 3670016), (i3 >> 9) & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        function07 = function0122;
                        function08 = function010;
                        function09 = function011;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function05 = function02;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function06 = function03;
                if ((i3 & 9363) == 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function04 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function05 = function02;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function06 = function03;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function04 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function05 = function02;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function06 = function03;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoButtonBar(Modifier modifier, String str, String str2, boolean z, Function0<Unit> function0, Orientation orientation, Function0<Unit> function02, String str3, boolean z2, BentoButtons.Icon.Size16 size16, boolean z3, Function0<Unit> function03, String str4, boolean z4, BentoButtons.Icon.Size16 size162, boolean z5, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        String str5;
        int i5;
        String str6;
        int i6;
        boolean z6;
        int i7;
        Function0<Unit> function04;
        int i8;
        int i9;
        Function0<Unit> function05;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Composer composer2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final String str7;
        final String str8;
        final String str9;
        final Function0<Unit> function06;
        final BentoButtons.Icon.Size16 size163;
        final BentoButtons.Icon.Size16 size164;
        final boolean z7;
        final boolean z8;
        final Function0<Unit> function07;
        final boolean z9;
        final boolean z10;
        final boolean z11;
        final Function0<Unit> function08;
        final Orientation orientation2;
        final Modifier modifier3;
        final String str10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1382280739);
        int i28 = i3 & 1;
        if (i28 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        int i29 = i3 & 2;
        if (i29 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                str5 = str;
                i4 |= composerStartRestartGroup.changed(str5) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str6 = str2;
                    i4 |= composerStartRestartGroup.changed(str6) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z6 = z;
                        i4 |= composerStartRestartGroup.changed(z6) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function04 = function0;
                            i4 |= composerStartRestartGroup.changedInstance(function04) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(orientation == null ? -1 : orientation.ordinal()) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            function05 = function02;
                        } else {
                            function05 = function02;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function05) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(str3) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else {
                            if ((i & 100663296) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                            }
                            i13 = i3 & 512;
                            if (i13 == 0) {
                                i4 |= 805306368;
                            } else {
                                if ((i & 805306368) == 0) {
                                    i14 = i13;
                                    i4 |= composerStartRestartGroup.changed(size16) ? 536870912 : 268435456;
                                }
                                i15 = i3 & 1024;
                                if (i15 != 0) {
                                    i17 = i2 | 6;
                                    i16 = i15;
                                } else if ((i2 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i2 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                i18 = i3 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i2 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i30 = i17;
                                i20 = i3 & 4096;
                                if (i20 != 0) {
                                    i21 = i30 | 384;
                                } else if ((i2 & 384) == 0) {
                                    i21 = i30 | (composerStartRestartGroup.changed(str4) ? 256 : 128);
                                } else {
                                    i21 = i30;
                                }
                                i22 = i3 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i31 = i21;
                                    if ((i2 & 3072) == 0) {
                                        i23 = i31 | (composerStartRestartGroup.changed(z4) ? 2048 : 1024);
                                    } else {
                                        i23 = i31;
                                    }
                                }
                                i24 = i3 & 16384;
                                if (i24 == 0) {
                                    i25 = i23;
                                    if ((i2 & 24576) == 0) {
                                        i25 |= composerStartRestartGroup.changed(size162) ? 16384 : 8192;
                                    }
                                    i26 = i3 & 32768;
                                    if (i26 == 0) {
                                        i25 |= 196608;
                                    } else if ((i2 & 196608) == 0) {
                                        i25 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                                    }
                                    i27 = i25;
                                    if ((i4 & 306783379) == 306783378 || (74899 & i27) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier modifier4 = i28 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i29 != 0) {
                                            str5 = null;
                                        }
                                        if (i5 != 0) {
                                            str6 = null;
                                        }
                                        if (i6 != 0) {
                                            z6 = false;
                                        }
                                        if (i7 != 0) {
                                            function04 = null;
                                        }
                                        Orientation orientation3 = i8 == 0 ? Orientation.Vertical : orientation;
                                        if (i9 != 0) {
                                            function05 = null;
                                        }
                                        String str11 = i10 == 0 ? null : str3;
                                        boolean z12 = i12 == 0 ? false : z2;
                                        BentoButtons.Icon.Size16 size165 = i14 == 0 ? null : size16;
                                        boolean z13 = i16 == 0 ? true : z3;
                                        Function0<Unit> function09 = i19 == 0 ? null : function03;
                                        String str12 = i20 == 0 ? null : str4;
                                        boolean z14 = i22 == 0 ? false : z4;
                                        BentoButtons.Icon.Size16 size166 = i24 == 0 ? null : size162;
                                        boolean z15 = i26 == 0 ? true : z5;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1382280739, i4, i27, "com.robinhood.compose.bento.component.BentoButtonBar (BentoButtonBar.kt:64)");
                                        }
                                        ButtonBarStyle buttonBar = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButtonBar(composerStartRestartGroup, 0);
                                        BentoButtons.Icon.Size16 size167 = size166;
                                        Modifier modifier5 = modifier4;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, buttonBar.getSpacing().m21707getVerticalPaddingD9Ej5fM(), 1, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(buttonBar.getSpacing().m21704getHelperTextButtonStackD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                                        composer2 = composerStartRestartGroup;
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        String str13 = str6;
                                        boolean z16 = z6;
                                        HelperText(str5, str13, function04, z16, composer2, ((i4 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i4 >> 6) & 896) | (i4 & 7168), 0);
                                        int i32 = i4 >> 15;
                                        int i33 = i27 << 15;
                                        String str14 = str11;
                                        boolean z17 = z12;
                                        BentoButtons.Icon.Size16 size168 = size165;
                                        String str15 = str12;
                                        boolean z18 = z13;
                                        boolean z19 = z14;
                                        Function0<Unit> function010 = function09;
                                        boolean z20 = z15;
                                        ButtonStack(orientation3, str14, function05, z17, size168, z18, function010, str15, z19, size167, z20, composer2, (i32 & 57344) | (i32 & 14) | ((i4 >> 18) & 112) | ((i4 >> 12) & 896) | (i32 & 7168) | (458752 & i33) | (3670016 & i33) | (29360128 & i33) | (234881024 & i33) | (i33 & 1879048192), (i27 >> 15) & 14, 0);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        str7 = str13;
                                        str8 = str5;
                                        str9 = str15;
                                        function06 = function05;
                                        size163 = size167;
                                        size164 = size168;
                                        Function0<Unit> function011 = function04;
                                        z7 = z18;
                                        z8 = z16;
                                        function07 = function011;
                                        z9 = z19;
                                        z10 = z20;
                                        z11 = z17;
                                        function08 = function010;
                                        orientation2 = orientation3;
                                        modifier3 = modifier5;
                                        str10 = str14;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        z11 = z2;
                                        size164 = size16;
                                        function08 = function03;
                                        z9 = z4;
                                        z10 = z5;
                                        composer2 = composerStartRestartGroup;
                                        str7 = str6;
                                        z8 = z6;
                                        modifier3 = modifier2;
                                        function07 = function04;
                                        str8 = str5;
                                        function06 = function05;
                                        orientation2 = orientation;
                                        str10 = str3;
                                        z7 = z3;
                                        str9 = str4;
                                        size163 = size162;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonBarKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return BentoButtonBar2.BentoButtonBar$lambda$2(modifier3, str8, str7, z8, function07, orientation2, function06, str10, z11, size164, z7, function08, str9, z9, size163, z10, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i25 = i23 | 24576;
                                i26 = i3 & 32768;
                                if (i26 == 0) {
                                }
                                i27 = i25;
                                if ((i4 & 306783379) == 306783378) {
                                    if (i28 == 0) {
                                    }
                                    if (i29 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ButtonBarStyle buttonBar2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButtonBar(composerStartRestartGroup, 0);
                                    BentoButtons.Icon.Size16 size1672 = size166;
                                    Modifier modifier52 = modifier4;
                                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, buttonBar2.getSpacing().m21707getVerticalPaddingD9Ej5fM(), 1, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(buttonBar2.getSpacing().m21704getHelperTextButtonStackD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    composer2 = composerStartRestartGroup;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        String str132 = str6;
                                        boolean z162 = z6;
                                        HelperText(str5, str132, function04, z162, composer2, ((i4 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i4 >> 6) & 896) | (i4 & 7168), 0);
                                        int i322 = i4 >> 15;
                                        int i332 = i27 << 15;
                                        String str142 = str11;
                                        boolean z172 = z12;
                                        BentoButtons.Icon.Size16 size1682 = size165;
                                        String str152 = str12;
                                        boolean z182 = z13;
                                        boolean z192 = z14;
                                        Function0<Unit> function0102 = function09;
                                        boolean z202 = z15;
                                        ButtonStack(orientation3, str142, function05, z172, size1682, z182, function0102, str152, z192, size1672, z202, composer2, (i322 & 57344) | (i322 & 14) | ((i4 >> 18) & 112) | ((i4 >> 12) & 896) | (i322 & 7168) | (458752 & i332) | (3670016 & i332) | (29360128 & i332) | (234881024 & i332) | (i332 & 1879048192), (i27 >> 15) & 14, 0);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        str7 = str132;
                                        str8 = str5;
                                        str9 = str152;
                                        function06 = function05;
                                        size163 = size1672;
                                        size164 = size1682;
                                        Function0<Unit> function0112 = function04;
                                        z7 = z182;
                                        z8 = z162;
                                        function07 = function0112;
                                        z9 = z192;
                                        z10 = z202;
                                        z11 = z172;
                                        function08 = function0102;
                                        orientation2 = orientation3;
                                        modifier3 = modifier52;
                                        str10 = str142;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i14 = i13;
                            i15 = i3 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i3 & 2048;
                            if (i18 != 0) {
                            }
                            int i302 = i17;
                            i20 = i3 & 4096;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 8192;
                            if (i22 != 0) {
                            }
                            i24 = i3 & 16384;
                            if (i24 == 0) {
                            }
                            i26 = i3 & 32768;
                            if (i26 == 0) {
                            }
                            i27 = i25;
                            if ((i4 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                        }
                        int i3022 = i17;
                        i20 = i3 & 4096;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 8192;
                        if (i22 != 0) {
                        }
                        i24 = i3 & 16384;
                        if (i24 == 0) {
                        }
                        i26 = i3 & 32768;
                        if (i26 == 0) {
                        }
                        i27 = i25;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function04 = function0;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    int i30222 = i17;
                    i20 = i3 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i3 & 16384;
                    if (i24 == 0) {
                    }
                    i26 = i3 & 32768;
                    if (i26 == 0) {
                    }
                    i27 = i25;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z6 = z;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function04 = function0;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 != 0) {
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                int i302222 = i17;
                i20 = i3 & 4096;
                if (i20 != 0) {
                }
                i22 = i3 & 8192;
                if (i22 != 0) {
                }
                i24 = i3 & 16384;
                if (i24 == 0) {
                }
                i26 = i3 & 32768;
                if (i26 == 0) {
                }
                i27 = i25;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str6 = str2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z6 = z;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function04 = function0;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            int i3022222 = i17;
            i20 = i3 & 4096;
            if (i20 != 0) {
            }
            i22 = i3 & 8192;
            if (i22 != 0) {
            }
            i24 = i3 & 16384;
            if (i24 == 0) {
            }
            i26 = i3 & 32768;
            if (i26 == 0) {
            }
            i27 = i25;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str5 = str;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        str6 = str2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z6 = z;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function04 = function0;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        int i30222222 = i17;
        i20 = i3 & 4096;
        if (i20 != 0) {
        }
        i22 = i3 & 8192;
        if (i22 != 0) {
        }
        i24 = i3 & 16384;
        if (i24 == 0) {
        }
        i26 = i3 & 32768;
        if (i26 == 0) {
        }
        i27 = i25;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"UnusedContentLambdaTargetStateParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HelperText(final String str, final String str2, final Function0<Unit> function0, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1057028110);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                boolean z4 = i4 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057028110, i3, -1, "com.robinhood.compose.bento.component.HelperText (BentoButtonBar.kt:119)");
                }
                final ButtonBarStyle buttonBar = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButtonBar(composerStartRestartGroup, 0);
                if (str != null) {
                    if (str2 != null && function0 != null) {
                        composerStartRestartGroup.startReplaceGroup(-775376092);
                        if (z4) {
                            composerStartRestartGroup.startReplaceGroup(-775355322);
                            AnimatedContentKt.AnimatedContent(str + str2, null, null, null, "helper_text", null, ComposableLambda3.rememberComposableLambda(-945526733, true, new Function4<AnimatedContentScope, String, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoButtonBarKt.HelperText.1
                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str3, Composer composer2, Integer num) {
                                    invoke(animatedContentScope, str3, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedContentScope AnimatedContent, String it, Composer composer2, int i5) {
                                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-945526733, i5, -1, "com.robinhood.compose.bento.component.HelperText.<anonymous> (BentoButtonBar.kt:125)");
                                    }
                                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(str, str2, function0, TestTag3.testTag(Modifier.INSTANCE, BentoButtonBar2.BentoButtonBarTestTagAnimatedHelperTextWithLink), buttonBar.getColors().m21697getHelperText0d7_KjU(), 0L, TextStyle.m7655copyp1EtxEg$default(buttonBar.getTypography().getHelperTextStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0, composer2, 3072, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597440, 46);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-774705624);
                            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(str, str2, function0, TestTag3.testTag(Modifier.INSTANCE, BentoButtonBarTestTagHelperTextWithLink), buttonBar.getColors().m21697getHelperText0d7_KjU(), 0L, TextStyle.m7655copyp1EtxEg$default(buttonBar.getTypography().getHelperTextStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0, composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896), EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-774206555);
                        BentoText2.m20747BentoText38GnDrw(str, TestTag3.testTag(Modifier.INSTANCE, BentoButtonBarTestTagHelperText), Color.m6701boximpl(buttonBar.getColors().m21697getHelperText0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, buttonBar.getTypography().getHelperTextStyle(), composerStartRestartGroup, (i3 & 14) | 48, 0, 8120);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoButtonBar2.HelperText$lambda$3(str, str2, function0, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final ButtonBarStyle buttonBar2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButtonBar(composerStartRestartGroup, 0);
            if (str != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ButtonStack(final Orientation orientation, final String str, final Function0<Unit> function0, boolean z, BentoButtons.Icon.Size16 size16, boolean z2, final Function0<Unit> function02, final String str2, boolean z3, BentoButtons.Icon.Size16 size162, boolean z4, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z5;
        int i5;
        BentoButtons.Icon.Size16 size163;
        int i6;
        int i7;
        final boolean z6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        BentoButtons.Icon.Size16 size164;
        Modifier.Companion companion;
        boolean z7;
        boolean z8;
        boolean z9;
        BentoButtons.Icon.Size16 size165;
        boolean z10;
        final BentoButtons.Icon.Size16 size166;
        final boolean z11;
        final boolean z12;
        final BentoButtons.Icon.Size16 size167;
        final boolean z13;
        boolean z14;
        int i14;
        BentoButtons.Icon.Size16 size168;
        Modifier.Companion companion2;
        boolean z15;
        boolean z16;
        BentoButtons.Icon.Size16 size169;
        boolean z17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2131852269);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(orientation.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z5 = z;
                i4 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    size163 = size16;
                    i4 |= composerStartRestartGroup.changed(size163) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(str2) ? 8388608 : 4194304;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(z6) ? 67108864 : 33554432;
                    }
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                    if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changed(size162) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (composerStartRestartGroup.changed(z4) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i4 & 306783379) != 306783378 && (i12 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z13 = z2;
                        size166 = size162;
                        z12 = z5;
                        size167 = size163;
                        z11 = z4;
                    } else {
                        boolean z18 = i15 == 0 ? false : z5;
                        BentoButtons.Icon.Size16 size1610 = i5 == 0 ? null : size163;
                        boolean z19 = i6 == 0 ? true : z2;
                        boolean z20 = i7 == 0 ? false : z6;
                        BentoButtons.Icon.Size16 size1611 = i9 == 0 ? null : size162;
                        boolean z21 = i11 == 0 ? true : z4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2131852269, i4, i12, "com.robinhood.compose.bento.component.ButtonStack (BentoButtonBar.kt:172)");
                        }
                        if ((function0 == null || str == null) && (function02 == null || str2 == null)) {
                            throw new IllegalStateException("Primary and Secondary buttons cannot be null at the same time");
                        }
                        ButtonBarStyle.Spacing spacing = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButtonBar(composerStartRestartGroup, 0).getSpacing();
                        int i16 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
                        if (i16 == 1) {
                            boolean z22 = z20;
                            int i17 = i4;
                            BentoButtons.Icon.Size16 size1612 = size1611;
                            boolean z23 = z21;
                            BentoButtons.Icon.Size16 size1613 = size1610;
                            boolean z24 = z19;
                            boolean z25 = z18;
                            int i18 = i12;
                            composerStartRestartGroup.startReplaceGroup(-10600745);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(spacing.m21706getVerticalButtonStackSpacingD9Ej5fM());
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(252960194);
                            if (function0 == null || str == null) {
                                i13 = i18;
                                size164 = size1613;
                                companion = companion3;
                            } else {
                                i13 = i18;
                                companion = companion3;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function0, str, SizeKt.fillMaxWidth$default(TestTag3.testTag(companion3, BentoButtonBarTestTagPrimaryButton), 0.0f, 1, null), size1613, BentoButtons.Type.Primary, z24, z25, null, null, null, null, false, null, composerStartRestartGroup, ((i17 >> 6) & 14) | 24960 | (i17 & 112) | ((i17 >> 3) & 7168) | (i17 & 458752) | ((i17 << 9) & 3670016), 0, 8064);
                                size164 = size1613;
                            }
                            z7 = z24;
                            z8 = z25;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(252979092);
                            if (function02 == null || str2 == null) {
                                z9 = z22;
                                size165 = size1612;
                                z10 = z23;
                            } else {
                                int i19 = i17 >> 18;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, BentoButtonBarTestTagSecondaryButton), 0.0f, 1, null), size1612, BentoButtons.Type.Secondary, z23, z22, null, null, null, null, false, null, composerStartRestartGroup, (i19 & 7168) | (i19 & 14) | 24960 | (i19 & 112) | ((i13 << 15) & 458752) | ((i17 >> 6) & 3670016), 0, 8064);
                                z10 = z23;
                                z9 = z22;
                                size165 = size1612;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                        } else {
                            if (i16 != 2) {
                                composerStartRestartGroup.startReplaceGroup(-10601259);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-10558702);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(spacing.m21705getHorizontalButtonStackSpacingD9Ej5fM());
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion5);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                            boolean z26 = z18;
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1003819527);
                            if (function02 == null || str2 == null) {
                                z14 = z20;
                                i14 = i4;
                                size168 = size1611;
                                companion2 = companion5;
                                z15 = z21;
                            } else {
                                int i20 = i12;
                                boolean z27 = z20;
                                companion2 = companion5;
                                int i21 = i4 >> 18;
                                int i22 = ((i20 << 15) & 458752) | (i21 & 7168) | (i21 & 14) | 24576 | (i21 & 112) | ((i4 >> 6) & 3670016);
                                BentoButtons.Icon.Size16 size1614 = size1611;
                                int i23 = i4;
                                boolean z28 = z21;
                                i14 = i23;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, Row5.weight$default(row6, companion2, 1.0f, false, 2, null), size1614, BentoButtons.Type.Secondary, z28, z27, null, null, null, null, false, null, composerStartRestartGroup, i22, 0, 8064);
                                size168 = size1614;
                                z15 = z28;
                                z14 = z27;
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1003835767);
                            if (function0 == null || str == null) {
                                z16 = z26;
                                size169 = size1610;
                                z17 = z19;
                            } else {
                                z16 = z26;
                                size169 = size1610;
                                z17 = z19;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function0, str, Row5.weight$default(row6, companion2, 1.0f, false, 2, null), size169, BentoButtons.Type.Primary, z17, z16, null, null, null, null, false, null, composerStartRestartGroup, ((i14 >> 6) & 14) | 24576 | (i14 & 112) | ((i14 >> 3) & 7168) | (i14 & 458752) | ((i14 << 9) & 3670016), 0, 8064);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                            size164 = size169;
                            z7 = z17;
                            z8 = z16;
                            z9 = z14;
                            size165 = size168;
                            z10 = z15;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        size166 = size165;
                        z11 = z10;
                        z6 = z9;
                        z12 = z8;
                        size167 = size164;
                        z13 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonBarKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoButtonBar2.ButtonStack$lambda$7(orientation, str, function0, z12, size167, z13, function02, str2, z6, size166, z11, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 805306368;
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                    if (i15 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (function0 == null) {
                        throw new IllegalStateException("Primary and Secondary buttons cannot be null at the same time");
                    }
                    throw new IllegalStateException("Primary and Secondary buttons cannot be null at the same time");
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            size163 = size16;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z5 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        size163 = size16;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
