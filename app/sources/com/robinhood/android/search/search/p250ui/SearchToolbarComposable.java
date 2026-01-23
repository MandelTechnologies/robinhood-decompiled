package com.robinhood.android.search.search.p250ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.search.C27909R;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.appbar.NavIconButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: SearchToolbarComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÍ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u001f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"SearchToolbarComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "onBackPressed", "Lkotlin/Function0;", "onQueryChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "query", "onQueryCleared", "onQueryCancelled", "onFocusChanged", "", "focused", "emptyTitleStr", "", "loading", "showBackBtn", "initialFocusSet", "initialQueryInput", "isRecentSearchDisplayed", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IZZZLjava/lang/String;ZLandroidx/compose/runtime/Composer;III)V", "LoadingIndicator", "show", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionalBackButton", "visible", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TEST_TAG_TEXT_INPUT", NavIconButton.TEST_TAG_BACK_BUTTON, "searchRegex", "Lkotlin/text/Regex;", "feature-search_externalRelease", "isQueryInputFocused", "input"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.search.ui.SearchToolbarComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchToolbarComposable {
    public static final String TEST_TAG_BACK_BUTTON = "SearchToolbarComposable.BackButton";
    public static final String TEST_TAG_TEXT_INPUT = "SearchToolbarComposable.TextInput";
    private static final Regex searchRegex = new Regex("^[/@]?[-a-zA-Z0-9\\s]{0,20}$");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicator$lambda$13(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingIndicator(z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionalBackButton$lambda$14(boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionalBackButton(z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionalBackButton$lambda$15(boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionalBackButton(z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchToolbarComposable$lambda$12(Modifier modifier, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function1 function12, int i, boolean z, boolean z2, boolean z3, String str, boolean z4, int i2, int i3, int i4, Composer composer, int i5) {
        SearchToolbarComposable(modifier, function0, function1, function02, function03, function12, i, z, z2, z3, str, z4, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchToolbarComposable$lambda$3$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchToolbarComposable$lambda$9$lambda$8(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchToolbarComposable(Modifier modifier, Function0<Unit> function0, Function1<? super String, Unit> function1, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Boolean, Unit> function12, int i, boolean z, boolean z2, boolean z3, String str, boolean z4, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        Function0<Unit> function04;
        int i6;
        Function1<? super String, Unit> function13;
        int i7;
        Function0<Unit> function05;
        int i8;
        int i9;
        Function1<? super Boolean, Unit> function14;
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
        Modifier modifier3;
        Function0<Unit> function06;
        Function1<? super String, Unit> function15;
        Function0<Unit> function07;
        Function1<? super Boolean, Unit> function16;
        boolean z5;
        boolean z6;
        boolean z7;
        String str2;
        int i21;
        boolean z8;
        Modifier modifier4;
        final boolean z9;
        boolean z10;
        Object objRememberedValue;
        boolean z11;
        boolean z12;
        final boolean z13;
        final Function0<Unit> function08;
        final Function1<? super Boolean, Unit> function17;
        final Function0<Unit> function09;
        final int i22;
        final Function1<? super String, Unit> function18;
        final Function0<Unit> function010;
        final boolean z14;
        final boolean z15;
        final String str3;
        final boolean z16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1709949339);
        int i23 = i4 & 1;
        if (i23 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        int i24 = i4 & 2;
        if (i24 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function04 = function0;
                i5 |= composerStartRestartGroup.changedInstance(function04) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    function13 = function1;
                    i5 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function05 = function02;
                        i5 |= composerStartRestartGroup.changedInstance(function05) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                            function14 = function12;
                        } else {
                            function14 = function12;
                            if ((i2 & 196608) == 0) {
                                i5 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            }
                        }
                        if ((i2 & 1572864) == 0) {
                            i10 = i;
                            i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(i10)) ? 1048576 : 524288;
                        } else {
                            i10 = i;
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i13 = i12;
                                i5 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                            }
                            i14 = i4 & 512;
                            if (i14 != 0) {
                                if ((i2 & 805306368) == 0) {
                                    i15 = i14;
                                    i5 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                                }
                                i16 = i4 & 1024;
                                if (i16 != 0) {
                                    i18 = i3 | 6;
                                    i17 = i16;
                                } else if ((i3 & 6) == 0) {
                                    i17 = i16;
                                    i18 = i3 | (composerStartRestartGroup.changed(str) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                    i18 = i3;
                                }
                                i19 = i4 & 2048;
                                if (i19 != 0) {
                                    i18 |= 48;
                                    i20 = i19;
                                } else if ((i3 & 48) == 0) {
                                    i20 = i19;
                                    i18 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
                                } else {
                                    i20 = i19;
                                }
                                int i25 = i18;
                                if ((i5 & 306783379) == 306783378 && (i25 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    str3 = str;
                                    modifier4 = modifier2;
                                    function08 = function05;
                                    i22 = i10;
                                    function09 = function04;
                                    function17 = function14;
                                    function18 = function13;
                                    function010 = function03;
                                    z13 = z;
                                    z14 = z2;
                                    z15 = z3;
                                    z16 = z4;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier3 = i23 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i24 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            }
                                            function06 = (Function0) objRememberedValue2;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            function06 = function04;
                                        }
                                        if (i6 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return SearchToolbarComposable.SearchToolbarComposable$lambda$3$lambda$2((String) obj);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            }
                                            function15 = (Function1) objRememberedValue3;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            function15 = function13;
                                        }
                                        if (i7 != 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                            }
                                            function05 = (Function0) objRememberedValue4;
                                            composerStartRestartGroup.endReplaceGroup();
                                        }
                                        if (i8 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            }
                                            function07 = (Function0) objRememberedValue5;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            function07 = function03;
                                        }
                                        if (i9 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return SearchToolbarComposable.SearchToolbarComposable$lambda$9$lambda$8(((Boolean) obj).booleanValue());
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                            }
                                            function16 = (Function1) objRememberedValue6;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            function16 = function14;
                                        }
                                        if ((i4 & 64) != 0) {
                                            i10 = C27909R.string.search_hint;
                                            i5 &= -3670017;
                                        }
                                        z5 = i11 == 0 ? false : z;
                                        z6 = i13 == 0 ? false : z2;
                                        z7 = i15 == 0 ? false : z3;
                                        str2 = i17 == 0 ? "" : str;
                                        i21 = i5;
                                        if (i20 == 0) {
                                            z8 = false;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            modifier4 = modifier3;
                                            z9 = z5;
                                            ComposerKt.traceEventStart(1709949339, i21, i25, "com.robinhood.android.search.search.ui.SearchToolbarComposable (SearchToolbarComposable.kt:57)");
                                        } else {
                                            modifier4 = modifier3;
                                            z9 = z5;
                                        }
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        z10 = ((i25 & 14) == 4) | ((1879048192 & i21) == 536870912) | ((234881024 & i21) == 67108864) | ((i21 & 112) == 32) | ((458752 & i21) == 131072) | ((((3670016 & i21) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(i10)) || (i21 & 1572864) == 1048576) | ((i21 & 896) == 256) | ((i21 & 7168) == 2048) | ((i25 & 112) == 32) | ((57344 & i21) == 16384) | ((29360128 & i21) == 8388608);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            final Function1<? super Boolean, Unit> function19 = function16;
                                            final boolean z17 = z8;
                                            final Function0<Unit> function011 = function06;
                                            final Function0<Unit> function012 = function05;
                                            final int i26 = i10;
                                            final Function1<? super String, Unit> function110 = function15;
                                            final Function0<Unit> function013 = function07;
                                            final boolean z18 = z6;
                                            final boolean z19 = z7;
                                            final String str4 = str2;
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return SearchToolbarComposable.SearchToolbarComposable$lambda$11$lambda$10(str4, z19, z9, z18, function011, function19, i26, function110, function012, z17, function013, (LazyListScope) obj);
                                                }
                                            };
                                            z11 = z9;
                                            z12 = z17;
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        } else {
                                            z11 = z9;
                                            z12 = z8;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        LazyDslKt.LazyColumn(modifier4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i21 & 14, 510);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        Function0<Unit> function014 = function05;
                                        z13 = z11;
                                        function08 = function014;
                                        function17 = function16;
                                        function09 = function06;
                                        i22 = i10;
                                        function18 = function15;
                                        function010 = function07;
                                        z14 = z6;
                                        z15 = z7;
                                        str3 = str2;
                                        z16 = z12;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i4 & 64) != 0) {
                                            i5 &= -3670017;
                                        }
                                        function07 = function03;
                                        z5 = z;
                                        str2 = str;
                                        modifier3 = modifier2;
                                        i21 = i5;
                                        function06 = function04;
                                        function16 = function14;
                                        function15 = function13;
                                        z6 = z2;
                                        z7 = z3;
                                    }
                                    z8 = z4;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    if ((1879048192 & i21) == 536870912) {
                                    }
                                    if (((3670016 & i21) ^ 1572864) > 1048576) {
                                        z10 = ((i25 & 14) == 4) | ((1879048192 & i21) == 536870912) | ((234881024 & i21) == 67108864) | ((i21 & 112) == 32) | ((458752 & i21) == 131072) | ((((3670016 & i21) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(i10)) || (i21 & 1572864) == 1048576) | ((i21 & 896) == 256) | ((i21 & 7168) == 2048) | ((i25 & 112) == 32) | ((57344 & i21) == 16384) | ((29360128 & i21) == 8388608);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z10) {
                                            final Function1 function192 = function16;
                                            final boolean z172 = z8;
                                            final Function0 function0112 = function06;
                                            final Function0 function0122 = function05;
                                            final int i262 = i10;
                                            final Function1 function1102 = function15;
                                            final Function0 function0132 = function07;
                                            final boolean z182 = z6;
                                            final boolean z192 = z7;
                                            final String str42 = str2;
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return SearchToolbarComposable.SearchToolbarComposable$lambda$11$lambda$10(str42, z192, z9, z182, function0112, function192, i262, function1102, function0122, z172, function0132, (LazyListScope) obj);
                                                }
                                            };
                                            z11 = z9;
                                            z12 = z172;
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            composerStartRestartGroup.endReplaceGroup();
                                            LazyDslKt.LazyColumn(modifier4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i21 & 14, 510);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            Function0<Unit> function0142 = function05;
                                            z13 = z11;
                                            function08 = function0142;
                                            function17 = function16;
                                            function09 = function06;
                                            i22 = i10;
                                            function18 = function15;
                                            function010 = function07;
                                            z14 = z6;
                                            z15 = z7;
                                            str3 = str2;
                                            z16 = z12;
                                        }
                                    } else {
                                        z10 = ((i25 & 14) == 4) | ((1879048192 & i21) == 536870912) | ((234881024 & i21) == 67108864) | ((i21 & 112) == 32) | ((458752 & i21) == 131072) | ((((3670016 & i21) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(i10)) || (i21 & 1572864) == 1048576) | ((i21 & 896) == 256) | ((i21 & 7168) == 2048) | ((i25 & 112) == 32) | ((57344 & i21) == 16384) | ((29360128 & i21) == 8388608);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z10) {
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final Modifier modifier5 = modifier4;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return SearchToolbarComposable.SearchToolbarComposable$lambda$12(modifier5, function09, function18, function08, function010, function17, i22, z13, z14, z15, str3, z16, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 805306368;
                            i15 = i14;
                            i16 = i4 & 1024;
                            if (i16 != 0) {
                            }
                            i19 = i4 & 2048;
                            if (i19 != 0) {
                            }
                            int i252 = i18;
                            if ((i5 & 306783379) == 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0) {
                                    if (i23 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if ((i4 & 64) != 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    i21 = i5;
                                    if (i20 == 0) {
                                        z8 = z4;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    if ((1879048192 & i21) == 536870912) {
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i4 & 512;
                        if (i14 != 0) {
                        }
                        i15 = i14;
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                        }
                        i19 = i4 & 2048;
                        if (i19 != 0) {
                        }
                        int i2522 = i18;
                        if ((i5 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i4 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i4 & 2048;
                    if (i19 != 0) {
                    }
                    int i25222 = i18;
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function05 = function02;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i4 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                i19 = i4 & 2048;
                if (i19 != 0) {
                }
                int i252222 = i18;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function13 = function1;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function05 = function02;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i4 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            i19 = i4 & 2048;
            if (i19 != 0) {
            }
            int i2522222 = i18;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function04 = function0;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        function13 = function1;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function05 = function02;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i4 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        i19 = i4 & 2048;
        if (i19 != 0) {
        }
        int i25222222 = i18;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchToolbarComposable$lambda$11$lambda$10(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function1 function1, int i, Function1 function12, Function0 function02, boolean z4, Function0 function03, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(39784444, true, new SearchToolbarComposable2(str, z, z2, z3, function0, function1, i, function12, function02, z4, function03)), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingIndicator(boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1455263290);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1455263290, i3, -1, "com.robinhood.android.search.search.ui.LoadingIndicator (SearchToolbarComposable.kt:153)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            z2 = z;
            BentoProgressBar2.m20697BentoIndeterminateProgressBareaDK9VM(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM()), z2, bentoTheme.getColors(composerStartRestartGroup, i5).getPrimeLight(), 0L, composerStartRestartGroup, (i3 << 3) & 112, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchToolbarComposable.LoadingIndicator$lambda$13(z2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OptionalBackButton(final boolean z, Modifier modifier, final Function0<Unit> onBackPressed, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(2146573644);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2146573644, i3, -1, "com.robinhood.android.search.search.ui.OptionalBackButton (SearchToolbarComposable.kt:168)");
            }
            if (!z) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SearchToolbarComposable.OptionalBackButton$lambda$14(z, modifier2, onBackPressed, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            modifier = modifier2;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ARROW_LEFT_24), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), TestTag3.testTag(modifier, TEST_TAG_BACK_BUTTON), onBackPressed, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48 | ((i3 << 6) & 57344), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier3 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchToolbarComposable.OptionalBackButton$lambda$15(z, modifier3, onBackPressed, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
