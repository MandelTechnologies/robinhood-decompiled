package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.IconKt;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.models.serverdriven.experimental.api.ButtonIcon;
import com.robinhood.models.serverdriven.experimental.api.ButtonIconPosition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: ButtonIcons.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"toBentoTextButtonIconSize12", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Size12;", "Lcom/robinhood/models/serverdriven/experimental/api/ButtonIcon;", "(Lcom/robinhood/models/serverdriven/experimental/api/ButtonIcon;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Size12;", "Lrh_server_driven_ui/v1/IconDto;", "(Lrh_server_driven_ui/v1/IconDto;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Size12;", "toBentoTextButtonIconPosition", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Position;", "Lcom/robinhood/models/serverdriven/experimental/api/ButtonIconPosition;", "(Lcom/robinhood/models/serverdriven/experimental/api/ButtonIconPosition;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Position;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ButtonIconsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ButtonIcons {

    /* compiled from: ButtonIcons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ButtonIconsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonIconPosition.values().length];
            try {
                iArr[ButtonIconPosition.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonIconPosition.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BentoTextButton3.Icon.Size12 toBentoTextButtonIconSize12(ButtonIcon buttonIcon, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(buttonIcon, "<this>");
        composer.startReplaceGroup(-2049661689);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2049661689, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toBentoTextButtonIconSize12 (ButtonIcons.kt:11)");
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(buttonIcon.getIcon().getServerValue());
        BentoTextButton3.Icon.Size12 size12 = serverToBentoAssetMapper2FromServerValue == null ? null : new BentoTextButton3.Icon.Size12(serverToBentoAssetMapper2FromServerValue, toBentoTextButtonIconPosition(buttonIcon.getPosition(), composer, 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return size12;
    }

    public static final BentoTextButton3.Icon.Size12 toBentoTextButtonIconSize12(IconDto iconDto, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(iconDto, "<this>");
        composer.startReplaceGroup(-1964012218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1964012218, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toBentoTextButtonIconSize12 (ButtonIcons.kt:24)");
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(IconKt.getServerValue(iconDto));
        BentoTextButton3.Icon.Size12 size12 = serverToBentoAssetMapper2FromServerValue != null ? new BentoTextButton3.Icon.Size12(serverToBentoAssetMapper2FromServerValue, null, 2, null) : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return size12;
    }

    public static final BentoTextButton3.Icon.Position toBentoTextButtonIconPosition(ButtonIconPosition buttonIconPosition, Composer composer, int i) {
        BentoTextButton3.Icon.Position position;
        Intrinsics.checkNotNullParameter(buttonIconPosition, "<this>");
        composer.startReplaceGroup(1176564190);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1176564190, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toBentoTextButtonIconPosition (ButtonIcons.kt:36)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[buttonIconPosition.ordinal()];
        if (i2 == 1) {
            position = BentoTextButton3.Icon.Position.Leading;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            position = BentoTextButton3.Icon.Position.Trailing;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return position;
    }
}
