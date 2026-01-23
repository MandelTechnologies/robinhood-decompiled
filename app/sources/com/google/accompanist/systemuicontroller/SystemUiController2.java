package com.google.accompanist.systemuicontroller;

import android.view.View;
import android.view.Window;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemUiController.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m3636d2 = {"Lcom/google/accompanist/systemuicontroller/AndroidSystemUiController;", "Lcom/google/accompanist/systemuicontroller/SystemUiController;", "Landroid/view/View;", "view", "Landroid/view/Window;", "window", "<init>", "(Landroid/view/View;Landroid/view/Window;)V", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "", "setStatusBarColor-ek8zF_U", "(JZLkotlin/jvm/functions/Function1;)V", "setStatusBarColor", "Landroid/view/View;", "Landroid/view/Window;", "Landroidx/core/view/WindowInsetsControllerCompat;", "windowInsetsController", "Landroidx/core/view/WindowInsetsControllerCompat;", "value", "getStatusBarDarkContentEnabled", "()Z", "setStatusBarDarkContentEnabled", "(Z)V", "statusBarDarkContentEnabled", "systemuicontroller_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.accompanist.systemuicontroller.AndroidSystemUiController, reason: use source file name */
/* loaded from: classes16.dex */
public final class SystemUiController2 implements SystemUiController {
    private final View view;
    private final Window window;
    private final WindowInsetsControllerCompat windowInsetsController;

    public SystemUiController2(View view, Window window) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.window = window;
        this.windowInsetsController = window != null ? WindowCompat.getInsetsController(window, view) : null;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    /* renamed from: setStatusBarColor-ek8zF_U, reason: not valid java name */
    public void mo9211setStatusBarColorek8zF_U(long color, boolean darkIcons, Function1<? super Color, Color> transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        Intrinsics.checkNotNullParameter(transformColorForLightContent, "transformColorForLightContent");
        setStatusBarDarkContentEnabled(darkIcons);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (darkIcons && ((windowInsetsControllerCompat = this.windowInsetsController) == null || !windowInsetsControllerCompat.isAppearanceLightStatusBars())) {
            color = transformColorForLightContent.invoke(Color.m6701boximpl(color)).getValue();
        }
        window.setStatusBarColor(Color2.m6735toArgb8_81llA(color));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setStatusBarDarkContentEnabled(boolean z) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.setAppearanceLightStatusBars(z);
    }
}
