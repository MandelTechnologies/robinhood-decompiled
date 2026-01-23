package com.google.accompanist.systemuicontroller;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: SystemUiController.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m3636d2 = {"Lcom/google/accompanist/systemuicontroller/SystemUiController;", "", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "", "setStatusBarColor-ek8zF_U", "(JZLkotlin/jvm/functions/Function1;)V", "setStatusBarColor", "getStatusBarDarkContentEnabled", "()Z", "setStatusBarDarkContentEnabled", "(Z)V", "statusBarDarkContentEnabled", "systemuicontroller_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface SystemUiController {
    /* renamed from: setStatusBarColor-ek8zF_U */
    void mo9211setStatusBarColorek8zF_U(long color, boolean darkIcons, Function1<? super Color, Color> transformColorForLightContent);

    void setStatusBarDarkContentEnabled(boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setStatusBarColor-ek8zF_U$default, reason: not valid java name */
    static /* synthetic */ void m9212setStatusBarColorek8zF_U$default(SystemUiController systemUiController, long j, boolean z, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
        }
        if ((i & 2) != 0) {
            z = Color2.m6734luminance8_81llA(j) > 0.5f;
        }
        if ((i & 4) != 0) {
            function1 = SystemUiController3.BlackScrimmed;
        }
        systemUiController.mo9211setStatusBarColorek8zF_U(j, z, function1);
    }
}
