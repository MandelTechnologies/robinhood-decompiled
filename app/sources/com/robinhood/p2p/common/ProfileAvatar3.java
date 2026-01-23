package com.robinhood.p2p.common;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.LocalImageLoader;
import coil.compose.LocalImageLoader2;
import com.robinhood.compose.bento.component.BentoPogBackgroundOverride;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoPogState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.p2p.common.ProfileAvatar3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfileAvatar.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n\"\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"ProfileAvatar", "", "state", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "modifier", "Landroidx/compose/ui/Modifier;", "size", "Lcom/robinhood/compose/bento/component/BentoPogSize;", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/p2p/common/ProfileAvatarState;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoPogSize;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LocalImageLoaderOverride", "Lcom/robinhood/p2p/common/ImageLoaderCompositionLocal;", "getLocalImageLoaderOverride", "()Lcom/robinhood/p2p/common/ImageLoaderCompositionLocal;", "lib-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.p2p.common.ProfileAvatarKt, reason: use source file name */
/* loaded from: classes22.dex */
public final class ProfileAvatar3 {
    private static final ProfileAvatar LocalImageLoaderOverride = new ProfileAvatar(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileAvatar$lambda$0(ProfileAvatarState profileAvatarState, Modifier modifier, BentoPogSize bentoPogSize, Function0 function0, int i, int i2, Composer composer, int i3) {
        ProfileAvatar(profileAvatarState, modifier, bentoPogSize, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ProfileAvatar(final ProfileAvatarState state, Modifier modifier, BentoPogSize bentoPogSize, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(757609205);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(bentoPogSize == null ? -1 : bentoPogSize.ordinal()) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                bentoPogSize = BentoPogSize.ExtraLarge;
            }
            if (i6 != 0) {
                function0 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(757609205, i3, -1, "com.robinhood.p2p.common.ProfileAvatar (ProfileAvatar.kt:32)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalImageLoader.m9117providesimpl(LocalImageLoader2.getLocalImageLoader(), LocalImageLoaderOverride.getCurrent(composerStartRestartGroup, 6)), ComposableLambda3.rememberComposableLambda(825886261, true, new C359581(modifier, function0, state, bentoPogSize), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final BentoPogSize bentoPogSize2 = bentoPogSize;
        final Function0<Unit> function02 = function0;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.p2p.common.ProfileAvatarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileAvatar3.ProfileAvatar$lambda$0(state, modifier2, bentoPogSize2, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ProfileAvatar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.p2p.common.ProfileAvatarKt$ProfileAvatar$1 */
    static final class C359581 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ BentoPogSize $size;
        final /* synthetic */ ProfileAvatarState $state;

        C359581(Modifier modifier, Function0<Unit> function0, ProfileAvatarState profileAvatarState, BentoPogSize bentoPogSize) {
            this.$modifier = modifier;
            this.$onClick = function0;
            this.$state = profileAvatarState;
            this.$size = bentoPogSize;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            Modifier modifierM4893clickableXHw0xAI$default;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(825886261, i, -1, "com.robinhood.p2p.common.ProfileAvatar.<anonymous> (ProfileAvatar.kt:37)");
            }
            RoundedCornerShape circleShape = RoundedCornerShape2.getCircleShape();
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            composer.startReplaceGroup(-892247205);
            Modifier modifierClip = Clip.clip(this.$modifier, RoundedCornerShape2.getCircleShape());
            final Function0<Unit> function0 = this.$onClick;
            if (function0 != null) {
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.p2p.common.ProfileAvatarKt$ProfileAvatar$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileAvatar3.C359581.invoke$lambda$2$lambda$1$lambda$0(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null);
                if (modifierM4893clickableXHw0xAI$default == null) {
                    modifierM4893clickableXHw0xAI$default = modifierClip;
                }
            }
            composer.endReplaceGroup();
            final ProfileAvatarState profileAvatarState = this.$state;
            final BentoPogSize bentoPogSize = this.$size;
            SurfaceKt.m5643SurfaceFjzlyU(modifierM4893clickableXHw0xAI$default, circleShape, jM21371getBg0d7_KjU, 0L, null, 0.0f, ComposableLambda3.rememberComposableLambda(2125975417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.p2p.common.ProfileAvatarKt.ProfileAvatar.1.2
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
                        ComposerKt.traceEventStart(2125975417, i2, -1, "com.robinhood.p2p.common.ProfileAvatar.<anonymous>.<anonymous> (ProfileAvatar.kt:44)");
                    }
                    ProfileAvatarState profileAvatarState2 = profileAvatarState;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    BentoPogKt.BentoPog(new BentoPogState(ProfileAvatarState2.toBentoPogContent(profileAvatarState2, bentoTheme.getColors(composer2, i3)), BentoPogDefaults.INSTANCE.getDefaultColors(composer2, BentoPogDefaults.$stable), bentoPogSize, false, false, null, new BentoPogBackgroundOverride.ColorOverride(bentoTheme.getColors(composer2, i3).m21372getBg20d7_KjU(), null), 56, null), null, composer2, BentoPogState.$stable, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final ProfileAvatar getLocalImageLoaderOverride() {
        return LocalImageLoaderOverride;
    }
}
