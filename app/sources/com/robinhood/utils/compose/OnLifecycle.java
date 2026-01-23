package com.robinhood.utils.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OnLifecycle.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"OnLifecycle", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onCreate", "Lkotlin/Function0;", "onStart", "onResume", "onPause", "onDestroy", "onStop", "onAny", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.compose.OnLifecycleKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class OnLifecycle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnLifecycle$lambda$3(LifecycleOwner lifecycleOwner, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, int i, int i2, Composer composer, int i3) {
        OnLifecycle(lifecycleOwner, function0, function02, function03, function04, function05, function06, function07, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnLifecycle(final LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function08;
        int i4;
        Function0<Unit> function09;
        int i5;
        Function0<Unit> function010;
        int i6;
        Function0<Unit> function011;
        int i7;
        Function0<Unit> function012;
        int i8;
        Function0<Unit> function013;
        int i9;
        int i10;
        final Function0<Unit> function014;
        final Function0<Unit> function015;
        final Function0<Unit> function016;
        final Function0<Unit> function017;
        boolean zChangedInstance;
        Object obj;
        int i11;
        final Function0<Unit> function018;
        final Function0<Unit> function019;
        final Function0<Unit> function020;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1067920413);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function08 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function08) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function09 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function09) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function010 = function03;
                        i3 |= composerStartRestartGroup.changedInstance(function010) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function011 = function04;
                            i3 |= composerStartRestartGroup.changedInstance(function011) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                            function012 = function05;
                        } else {
                            function012 = function05;
                            if ((i & 196608) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function012) ? 131072 : 65536;
                            }
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            function013 = function06;
                        } else {
                            function013 = function06;
                            if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function013) ? 1048576 : 524288;
                            }
                        }
                        i9 = i2 & 128;
                        if (i9 == 0) {
                            if ((i & 12582912) == 0) {
                                i10 = i9;
                                i3 |= composerStartRestartGroup.changedInstance(function07) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                if (i12 != 0) {
                                    function08 = null;
                                }
                                function014 = i4 == 0 ? null : function09;
                                if (i5 != 0) {
                                    function010 = null;
                                }
                                if (i6 != 0) {
                                    function011 = null;
                                }
                                function015 = i7 == 0 ? null : function012;
                                function016 = i8 == 0 ? null : function013;
                                function017 = i10 == 0 ? null : function07;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1067920413, i3, -1, "com.robinhood.utils.compose.OnLifecycle (OnLifecycle.kt:21)");
                                }
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((57344 & i3) != 16384) | ((458752 & i3) != 131072) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    i11 = i3;
                                    function018 = function08;
                                    function019 = function011;
                                    function020 = function010;
                                    obj = new Function1() { // from class: com.robinhood.utils.compose.OnLifecycleKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return OnLifecycle.OnLifecycle$lambda$2$lambda$1(lifecycleOwner, function018, function014, function020, function019, function015, function016, function017, (DisposableEffectScope) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(obj);
                                } else {
                                    i11 = i3;
                                    obj = objRememberedValue;
                                    function018 = function08;
                                    function019 = function011;
                                    function020 = function010;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) obj, composerStartRestartGroup, i11 & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function018 = function08;
                                function015 = function012;
                                function014 = function09;
                                function019 = function011;
                                function017 = function07;
                                function016 = function013;
                                function020 = function010;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.OnLifecycleKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return OnLifecycle.OnLifecycle$lambda$3(lifecycleOwner, function018, function014, function020, function019, function015, function016, function017, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i10 = i9;
                        if ((i3 & 4793491) == 4793490) {
                            if (i12 != 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((57344 & i3) != 16384) | ((458752 & i3) != 131072) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                i11 = i3;
                                function018 = function08;
                                function019 = function011;
                                function020 = function010;
                                obj = new Function1() { // from class: com.robinhood.utils.compose.OnLifecycleKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return OnLifecycle.OnLifecycle$lambda$2$lambda$1(lifecycleOwner, function018, function014, function020, function019, function015, function016, function017, (DisposableEffectScope) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(obj);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) obj, composerStartRestartGroup, i11 & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function011 = function04;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function010 = function03;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function011 = function04;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function09 = function02;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function010 = function03;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function011 = function04;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function08 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function09 = function02;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function010 = function03;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function011 = function04;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult OnLifecycle$lambda$2$lambda$1(final LifecycleOwner lifecycleOwner, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, final Function0 function07, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.utils.compose.OnLifecycleKt$OnLifecycle$1$1$observer$1

            /* compiled from: OnLifecycle.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.utils.compose.OnLifecycleKt$OnLifecycle$1$1$observer$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
                    case 1:
                        Function0<Unit> function08 = function0;
                        if (function08 != null) {
                            function08.invoke();
                            return;
                        }
                        return;
                    case 2:
                        Function0<Unit> function09 = function02;
                        if (function09 != null) {
                            function09.invoke();
                            return;
                        }
                        return;
                    case 3:
                        Function0<Unit> function010 = function03;
                        if (function010 != null) {
                            function010.invoke();
                            return;
                        }
                        return;
                    case 4:
                        Function0<Unit> function011 = function04;
                        if (function011 != null) {
                            function011.invoke();
                            return;
                        }
                        return;
                    case 5:
                        Function0<Unit> function012 = function05;
                        if (function012 != null) {
                            function012.invoke();
                            return;
                        }
                        return;
                    case 6:
                        Function0<Unit> function013 = function06;
                        if (function013 != null) {
                            function013.invoke();
                            return;
                        }
                        return;
                    case 7:
                        Function0<Unit> function014 = function07;
                        if (function014 != null) {
                            function014.invoke();
                            return;
                        }
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.robinhood.utils.compose.OnLifecycleKt$OnLifecycle$lambda$2$lambda$1$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }
}
