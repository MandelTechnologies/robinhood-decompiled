package com.robinhood.compose.common.appbar;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NavIconButton.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a;\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\r8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\r8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m3636d2 = {"NavIconButton", "", "navigationType", "Lcom/robinhood/android/navigation/NavigationType;", "onNavIconClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "NavIconButton-ww6aTOc", "(Lcom/robinhood/android/navigation/NavigationType;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", NavIconButton.TEST_TAG_BACK_BUTTON, "", "getTEST_TAG_BACK_BUTTON$annotations", "()V", NavIconButton.TEST_TAG_CLOSE_BUTTON, "getTEST_TAG_CLOSE_BUTTON$annotations", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.appbar.NavIconButtonKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class NavIconButton {
    public static final String TEST_TAG_BACK_BUTTON = "TEST_TAG_BACK_BUTTON";
    public static final String TEST_TAG_CLOSE_BUTTON = "TEST_TAG_CLOSE_BUTTON";

    /* compiled from: NavIconButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.common.appbar.NavIconButtonKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationType.values().length];
            try {
                iArr[NavigationType.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationType.PRESENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationType.NO_TRANSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavIconButton_ww6aTOc$lambda$0(NavigationType navigationType, Function0 function0, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m21673NavIconButtonww6aTOc(navigationType, function0, modifier, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTEST_TAG_BACK_BUTTON$annotations() {
    }

    public static /* synthetic */ void getTEST_TAG_CLOSE_BUTTON$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* renamed from: NavIconButton-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21673NavIconButtonww6aTOc(final NavigationType navigationType, final Function0<Unit> onNavIconClick, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        long jM21685getForegroundColor0d7_KjU;
        Modifier modifier2;
        long j3;
        Composer composer2;
        final long j4;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onNavIconClick, "onNavIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(490745588);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(navigationType == null ? -1 : navigationType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNavIconClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(j2)) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier;
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    modifier2 = modifier4;
                    jM21685getForegroundColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getAppBar(composerStartRestartGroup, 0).getColors().m21685getForegroundColor0d7_KjU();
                } else {
                    jM21685getForegroundColor0d7_KjU = j2;
                    modifier2 = modifier4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                jM21685getForegroundColor0d7_KjU = j2;
                modifier2 = modifier;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(490745588, i3, -1, "com.robinhood.compose.common.appbar.NavIconButton (NavIconButton.kt:18)");
            }
            int i5 = navigationType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[navigationType.ordinal()];
            if (i5 == -1) {
                int i6 = i3;
                composerStartRestartGroup.startReplaceGroup(-266321873);
                j3 = jM21685getForegroundColor0d7_KjU;
                BentoAppBarScope.INSTANCE.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(modifier2, TEST_TAG_CLOSE_BUTTON), false, j3, onNavIconClick, composerStartRestartGroup, ((i6 >> 3) & 896) | ((i6 << 6) & 7168) | (BentoAppBarScope.$stable << 12), 2);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2 = composerStartRestartGroup;
                j4 = j3;
                modifier3 = modifier2;
            } else if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(-266593774);
                int i7 = i3;
                BentoAppBarScope.INSTANCE.m20575BentoBackButtondrOMvmE(TestTag3.testTag(modifier2, TEST_TAG_BACK_BUTTON), false, Color.m6701boximpl(jM21685getForegroundColor0d7_KjU), onNavIconClick, composerStartRestartGroup, (BentoAppBarScope.$stable << 12) | ((i7 << 6) & 7168) | ((i7 >> 3) & 896), 2);
                composerStartRestartGroup.endReplaceGroup();
                j3 = jM21685getForegroundColor0d7_KjU;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = composerStartRestartGroup;
                j4 = j3;
                modifier3 = modifier2;
            } else {
                if (i5 != 2 && i5 != 3) {
                    composerStartRestartGroup.startReplaceGroup(-839885183);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                int i62 = i3;
                composerStartRestartGroup.startReplaceGroup(-266321873);
                j3 = jM21685getForegroundColor0d7_KjU;
                BentoAppBarScope.INSTANCE.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(modifier2, TEST_TAG_CLOSE_BUTTON), false, j3, onNavIconClick, composerStartRestartGroup, ((i62 >> 3) & 896) | ((i62 << 6) & 7168) | (BentoAppBarScope.$stable << 12), 2);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = composerStartRestartGroup;
                j4 = j3;
                modifier3 = modifier2;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
            composer2 = composerStartRestartGroup;
            j4 = j2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.appbar.NavIconButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NavIconButton.NavIconButton_ww6aTOc$lambda$0(navigationType, onNavIconClick, modifier3, j4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
