package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.SpannableString;
import android.transition.AutoTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.C20692R;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoInfoBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"BentoInfoBannerComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "Landroid/text/SpannableString;", "icon", "", "ctaText", "ctaAction", "Lkotlin/Function0;", "canDismiss", "", "dismissAction", "textColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "backgroundColor", "(Landroidx/compose/ui/Modifier;Landroid/text/SpannableString;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lcom/robinhood/scarlet/util/resource/ResourceReference;Lcom/robinhood/scarlet/util/resource/ResourceReference;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "(Landroidx/compose/ui/Modifier;Landroid/text/SpannableString;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lcom/robinhood/scarlet/util/resource/ResourceReference;Lcom/robinhood/scarlet/util/resource/ResourceReference;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BentoInfoBannerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBannerComposable$lambda$0(Modifier modifier, SpannableString spannableString, String str, String str2, Function0 function0, boolean z, Function0 function02, ResourceReferences4 resourceReferences4, ResourceReferences4 resourceReferences42, int i, int i2, Composer composer, int i3) {
        BentoInfoBannerComposable(modifier, spannableString, str, str2, (Function0<Unit>) function0, z, (Function0<Unit>) function02, (ResourceReferences4<Integer>) resourceReferences4, (ResourceReferences4<Integer>) resourceReferences42, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBannerComposable$lambda$8(Modifier modifier, SpannableString spannableString, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Function0 function0, boolean z, Function0 function02, ResourceReferences4 resourceReferences4, ResourceReferences4 resourceReferences42, int i, int i2, Composer composer, int i3) {
        BentoInfoBannerComposable(modifier, spannableString, serverToBentoAssetMapper2, str, (Function0<Unit>) function0, z, (Function0<Unit>) function02, (ResourceReferences4<Integer>) resourceReferences4, (ResourceReferences4<Integer>) resourceReferences42, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    @SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoInfoBannerComposable(Modifier modifier, final SpannableString text, final String str, final String str2, Function0<Unit> function0, boolean z, Function0<Unit> function02, final ResourceReferences4<Integer> resourceReferences4, final ResourceReferences4<Integer> resourceReferences42, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        Function0<Unit> function03;
        int i5;
        boolean z2;
        int i6;
        final Modifier modifier3;
        final Function0<Unit> function04;
        final boolean z3;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-372913469);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(text) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                str3 = str2;
                i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(resourceReferences4) : composerStartRestartGroup.changedInstance(resourceReferences4) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= (134217728 & i) == 0 ? composerStartRestartGroup.changed(resourceReferences42) : composerStartRestartGroup.changedInstance(resourceReferences42) ? 67108864 : 33554432;
                    }
                    if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            function03 = null;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        Function0<Unit> function06 = i6 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-372913469, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposable (BentoInfoBannerComposable.kt:32)");
                        }
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(str);
                        int i8 = ResourceReferences4.$stable;
                        int i9 = (4193406 & i3) | (i8 << 21) | (29360128 & i3) | (i8 << 24) | (234881024 & i3);
                        String str4 = str3;
                        Function0<Unit> function07 = function03;
                        boolean z4 = z2;
                        BentoInfoBannerComposable(modifier4, text, serverToBentoAssetMapper2FromServerValue, str4, function07, z4, function06, resourceReferences4, resourceReferences42, composerStartRestartGroup, i9, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        function04 = function06;
                        z3 = z4;
                        function05 = function07;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function04 = function02;
                        modifier3 = modifier2;
                        function05 = function03;
                        z3 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoInfoBannerComposable.BentoInfoBannerComposable$lambda$0(modifier3, text, str, str2, function05, z3, function04, resourceReferences4, resourceReferences42, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((38347923 & i3) == 38347922) {
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue2 = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(str);
                    int i82 = ResourceReferences4.$stable;
                    int i92 = (4193406 & i3) | (i82 << 21) | (29360128 & i3) | (i82 << 24) | (234881024 & i3);
                    String str42 = str3;
                    Function0<Unit> function072 = function03;
                    boolean z42 = z2;
                    BentoInfoBannerComposable(modifier4, text, serverToBentoAssetMapper2FromServerValue2, str42, function072, z42, function06, resourceReferences4, resourceReferences42, composerStartRestartGroup, i92, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    function04 = function06;
                    z3 = z42;
                    function05 = function072;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str3 = str2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    @SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoInfoBannerComposable(Modifier modifier, final SpannableString text, final ServerToBentoAssetMapper2 serverToBentoAssetMapper2, final String str, Function0<Unit> function0, boolean z, Function0<Unit> function02, final ResourceReferences4<Integer> resourceReferences4, final ResourceReferences4<Integer> resourceReferences42, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int i4;
        final Function0<Unit> function03;
        int i5;
        boolean z2;
        int i6;
        Function0<Unit> function04;
        int i7;
        int i8;
        boolean z3;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Function0<Unit> function05;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-269890761);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(text) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    function04 = function02;
                } else {
                    function04 = function02;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function04) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    i7 = 12582912;
                } else {
                    if ((12582912 & i) == 0) {
                        i7 = (16777216 & i) == 0 ? composerStartRestartGroup.changed(resourceReferences4) : composerStartRestartGroup.changedInstance(resourceReferences4) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        if ((100663296 & i) == 0) {
                            i8 = (134217728 & i) == 0 ? composerStartRestartGroup.changed(resourceReferences42) : composerStartRestartGroup.changedInstance(resourceReferences42) ? 67108864 : 33554432;
                        }
                        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                function03 = null;
                            }
                            if (i5 != 0) {
                                z2 = false;
                            }
                            if (i6 != 0) {
                                function04 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-269890761, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposable (BentoInfoBannerComposable.kt:58)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            z3 = (57344 & i3) != 16384;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoInfoBannerComposable.BentoInfoBannerComposable$lambda$4$lambda$3(function03, (Context) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = composerStartRestartGroup.changedInstance(text) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((458752 & i3) != 131072) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608 || ((16777216 & i3) != 0 && composerStartRestartGroup.changedInstance(resourceReferences4))) | ((234881024 & i3) != 67108864 || ((134217728 & i3) != 0 && composerStartRestartGroup.changedInstance(resourceReferences42)));
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final String str3 = str2;
                                final boolean z4 = z2;
                                function05 = function04;
                                Function1 function12 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoInfoBannerComposable.BentoInfoBannerComposable$lambda$7$lambda$6(text, serverToBentoAssetMapper2, str3, z4, resourceReferences4, resourceReferences42, function05, (RdsInfoBannerView) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function12);
                                objRememberedValue2 = function12;
                            } else {
                                function05 = function04;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            AndroidView_androidKt.AndroidView(function1, modifierFillMaxWidth$default, (Function1) objRememberedValue2, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            function05 = function04;
                        }
                        final boolean z5 = z2;
                        final Function0<Unit> function06 = function03;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoInfoBannerComposable.BentoInfoBannerComposable$lambda$8(modifier3, text, serverToBentoAssetMapper2, str, function06, z5, function05, resourceReferences4, resourceReferences42, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = 100663296;
                    i3 |= i8;
                    if ((38347923 & i3) != 38347922) {
                        if (i9 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((57344 & i3) != 16384) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z3) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BentoInfoBannerComposable.BentoInfoBannerComposable$lambda$4$lambda$3(function03, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            Function1 function13 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            if ((29360128 & i3) != 8388608) {
                                if ((234881024 & i3) != 67108864) {
                                    zChangedInstance = composerStartRestartGroup.changedInstance(text) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((458752 & i3) != 131072) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608 || ((16777216 & i3) != 0 && composerStartRestartGroup.changedInstance(resourceReferences4))) | ((234881024 & i3) != 67108864 || ((134217728 & i3) != 0 && composerStartRestartGroup.changedInstance(resourceReferences42)));
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                        final String str32 = str2;
                                        final boolean z42 = z2;
                                        function05 = function04;
                                        Function1 function122 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return BentoInfoBannerComposable.BentoInfoBannerComposable$lambda$7$lambda$6(text, serverToBentoAssetMapper2, str32, z42, resourceReferences4, resourceReferences42, function05, (RdsInfoBannerView) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(function122);
                                        objRememberedValue2 = function122;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composer2 = composerStartRestartGroup;
                                        AndroidView_androidKt.AndroidView(function13, modifierFillMaxWidth$default2, (Function1) objRememberedValue2, composer2, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier4;
                                    }
                                }
                            }
                        }
                    }
                    final boolean z52 = z2;
                    final Function0 function062 = function03;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i3 |= i7;
                if ((i2 & 256) != 0) {
                }
                i3 |= i8;
                if ((38347923 & i3) != 38347922) {
                }
                final boolean z522 = z2;
                final Function0 function0622 = function03;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function03 = function0;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i3 |= i7;
            if ((i2 & 256) != 0) {
            }
            i3 |= i8;
            if ((38347923 & i3) != 38347922) {
            }
            final boolean z5222 = z2;
            final Function0 function06222 = function03;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i7;
        if ((i2 & 256) != 0) {
        }
        i3 |= i8;
        if ((38347923 & i3) != 38347922) {
        }
        final boolean z52222 = z2;
        final Function0 function062222 = function03;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RdsInfoBannerView BentoInfoBannerComposable$lambda$4$lambda$3(final Function0 function0, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C20692R.layout.info_banner, (ViewGroup) null, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.designsystem.banner.RdsInfoBannerView");
        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) viewInflate;
        if (function0 != null) {
            OnClickListeners.onClick(rdsInfoBannerView, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BentoInfoBannerComposable.BentoInfoBannerComposable$lambda$4$lambda$3$lambda$2$lambda$1(function0);
                }
            });
        }
        return rdsInfoBannerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBannerComposable$lambda$4$lambda$3$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBannerComposable$lambda$7$lambda$6(SpannableString spannableString, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, boolean z, ResourceReferences4 resourceReferences4, ResourceReferences4 resourceReferences42, final Function0 function0, final RdsInfoBannerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText(spannableString);
        if (serverToBentoAssetMapper2 != null) {
            view.setIcon(view.getContext().getResources().getDrawable(serverToBentoAssetMapper2.getResourceId(), view.getContext().getTheme()));
        }
        view.setCtaText(str);
        if (z) {
            view.onDismiss(new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BentoInfoBannerComposable.BentoInfoBannerComposable$lambda$7$lambda$6$lambda$5(view, function0);
                }
            });
        }
        if (resourceReferences4 != null) {
            view.setTextColor(resourceReferences4);
        }
        if (resourceReferences42 != null) {
            Resources.Theme theme = view.getContext().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            Integer num = (Integer) resourceReferences42.resolve(theme);
            if (num != null) {
                view.setBackgroundTintList(ColorStateList.valueOf(num.intValue()));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBannerComposable$lambda$7$lambda$6$lambda$5(RdsInfoBannerView rdsInfoBannerView, Function0 function0) {
        Intrinsics.checkNotNull(rdsInfoBannerView, "null cannot be cast to non-null type android.view.ViewGroup");
        Transitions2.beginDelayedTransition(rdsInfoBannerView, new AutoTransition());
        if (function0 != null) {
            function0.invoke();
        }
        rdsInfoBannerView.setVisibility(8);
        return Unit.INSTANCE;
    }
}
