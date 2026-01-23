package com.robinhood.p2p.common;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.p2p.common.ProfileAvatarState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileAvatarState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toBentoPogContent", "Lcom/robinhood/compose/bento/component/BentoPogContent;", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "colors", "Lcom/robinhood/compose/bento/theme/BentoColors;", "lib-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.p2p.common.ProfileAvatarStateKt, reason: use source file name */
/* loaded from: classes22.dex */
public final class ProfileAvatarState2 {
    public static final BentoPogContent toBentoPogContent(ProfileAvatarState profileAvatarState, BentoColors colors) {
        Intrinsics.checkNotNullParameter(profileAvatarState, "<this>");
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (profileAvatarState instanceof ProfileAvatarState.Image) {
            ProfileAvatarState.Image image = (ProfileAvatarState.Image) profileAvatarState;
            return new BentoPogContent.RemoteImage(image.getUrl(), image.getBackupText(), Color.m6701boximpl(colors.m21425getFg0d7_KjU()), null);
        }
        if (profileAvatarState instanceof ProfileAvatarState.Text) {
            return new BentoPogContent.Text(((ProfileAvatarState.Text) profileAvatarState).getText(), Color.m6701boximpl(colors.m21425getFg0d7_KjU()), null);
        }
        if (!(profileAvatarState instanceof ProfileAvatarState.Icon)) {
            throw new NoWhenBranchMatchedException();
        }
        return new BentoPogContent.Pictogram(((ProfileAvatarState.Icon) profileAvatarState).getAsset(), null, Color.m6701boximpl(colors.m21425getFg0d7_KjU()), null);
    }
}
