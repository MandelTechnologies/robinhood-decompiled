package androidx.compose.p011ui.viewinterop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.viewbinding.R$id;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ViewKt;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidViewBinding.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÁ\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0016\u001a$\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0011H\u0002\u001a\u001b\u0010\u001b\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u001c2\u0006\u0010\u001f\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010 ¨\u0006!"}, m3636d2 = {"AndroidViewBinding", "", "T", "Landroidx/viewbinding/ViewBinding;", "factory", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "modifier", "Landroidx/compose/ui/Modifier;", "onReset", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "onRelease", "update", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "forEachFragmentContainerView", "viewGroup", "action", "Landroidx/fragment/app/FragmentContainerView;", "getBinding", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "setBinding", "binding", "(Landroid/view/View;Landroidx/viewbinding/ViewBinding;)V", "ui-viewbinding_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class AndroidViewBinding {
    public static final <T extends ViewBinding> void AndroidViewBinding(final Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Function1<? super T, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            Function1<? super T, Unit> function13 = i5 != 0 ? new Function1<T, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.1
                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                public final void invoke(ViewBinding viewBinding) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((ViewBinding) obj);
                    return Unit.INSTANCE;
                }
            } : function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)");
            }
            AndroidViewBinding(function3, modifier3, null, null, function13, composerStartRestartGroup, (i3 & 14) | 384 | (i3 & 112) | (57344 & (i3 << 6)), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            function12 = function13;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function12 = function1;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    AndroidViewBinding.AndroidViewBinding(function3, modifier2, function12, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends ViewBinding> void AndroidViewBinding(final Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function1<? super T, Unit> function14;
        int i6;
        final Function1<? super T, Unit> function15;
        final Function1<? super T, Unit> function16;
        final Modifier modifier3;
        final Function1<? super T, Unit> function17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(509101952);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
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
                    i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function14 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            function15 = function13;
                            i3 |= composerStartRestartGroup.changedInstance(function15) ? 16384 : 8192;
                        }
                        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            Function1 function18 = null;
                            final Function1<? super T, Unit> function19 = i4 != 0 ? null : function1;
                            final Function1<? super T, Unit> function110 = i5 != 0 ? new Function1<T, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.3
                                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                                public final void invoke(ViewBinding viewBinding) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                                    invoke((ViewBinding) obj);
                                    return Unit.INSTANCE;
                                }
                            } : function14;
                            if (i6 != 0) {
                                function15 = new Function1<T, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.4
                                    /* JADX WARN: Incorrect types in method signature: (TT;)V */
                                    public final void invoke(ViewBinding viewBinding) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                                        invoke((ViewBinding) obj);
                                        return Unit.INSTANCE;
                                    }
                                };
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                            }
                            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                            boolean zChanged = composerStartRestartGroup.changed(view);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                try {
                                    objRememberedValue = ViewKt.findFragment(view);
                                } catch (IllegalStateException unused) {
                                    objRememberedValue = null;
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final Fragment fragment = (Fragment) objRememberedValue;
                            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(fragment);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Context, View>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final View invoke(Context context2) {
                                        LayoutInflater layoutInflaterFrom;
                                        Fragment fragment2 = fragment;
                                        if (fragment2 == null || (layoutInflaterFrom = fragment2.getLayoutInflater()) == null) {
                                            layoutInflaterFrom = LayoutInflater.from(context2);
                                        }
                                        ViewBinding viewBinding = (ViewBinding) function3.invoke(layoutInflaterFrom, new FrameLayout(context2), Boolean.FALSE);
                                        View root = viewBinding.getRoot();
                                        AndroidViewBinding.setBinding(root, viewBinding);
                                        return root;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function111 = (Function1) objRememberedValue2;
                            if (function19 == null) {
                                composerStartRestartGroup.startReplaceGroup(1526433192);
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1526433193);
                                boolean zChanged2 = composerStartRestartGroup.changed(function19);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$6$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                                            invoke2(view2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(View view2) {
                                            function19.invoke(AndroidViewBinding.getBinding(view2));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                function18 = (Function1) objRememberedValue3;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            boolean zChangedInstance2 = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(fragment) | composerStartRestartGroup.changedInstance(context);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$7$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                                        invoke2(view2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(View view2) {
                                        FragmentManager childFragmentManager;
                                        function110.invoke(AndroidViewBinding.getBinding(view2));
                                        final FragmentManager supportFragmentManager = null;
                                        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                                        if (viewGroup != null) {
                                            Fragment fragment2 = fragment;
                                            Context context2 = context;
                                            if (fragment2 == null || (childFragmentManager = fragment2.getChildFragmentManager()) == null) {
                                                FragmentActivity fragmentActivity = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
                                                if (fragmentActivity != null) {
                                                    supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                                }
                                            } else {
                                                supportFragmentManager = childFragmentManager;
                                            }
                                            AndroidViewBinding.forEachFragmentContainerView(viewGroup, new Function1<FragmentContainerView, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$7$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(FragmentContainerView fragmentContainerView) {
                                                    invoke2(fragmentContainerView);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(FragmentContainerView fragmentContainerView) {
                                                    FragmentManager fragmentManager = supportFragmentManager;
                                                    Fragment fragmentFindFragmentById = fragmentManager != null ? fragmentManager.findFragmentById(fragmentContainerView.getId()) : null;
                                                    if (fragmentFindFragmentById == null || supportFragmentManager.isStateSaved()) {
                                                        return;
                                                    }
                                                    FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                                                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
                                                    fragmentTransactionBeginTransaction.remove(fragmentFindFragmentById);
                                                    fragmentTransactionBeginTransaction.commitNow();
                                                }
                                            });
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function112 = (Function1) objRememberedValue4;
                            boolean z = (57344 & i3) == 16384;
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$8$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                                        invoke2(view2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(View view2) {
                                        function15.invoke(AndroidViewBinding.getBinding(view2));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            Function1<? super T, Unit> function113 = function110;
                            AndroidView_androidKt.AndroidView(function111, modifier4, function18, function112, (Function1) objRememberedValue5, composerStartRestartGroup, i3 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function17 = function113;
                            function16 = function19;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function16 = function1;
                            modifier3 = modifier2;
                            function17 = function14;
                        }
                        final Function1<? super T, Unit> function114 = function15;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.9
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i8) {
                                    AndroidViewBinding.AndroidViewBinding(function3, modifier3, function16, function17, function114, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    function15 = function13;
                    if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    final Function1<? super T, Unit> function1142 = function15;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function14 = function12;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function15 = function13;
                if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                final Function1<? super T, Unit> function11422 = function15;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function14 = function12;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function15 = function13;
            if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            final Function1<? super T, Unit> function114222 = function15;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function14 = function12;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function15 = function13;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        final Function1<? super T, Unit> function1142222 = function15;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> void setBinding(View view, T t) {
        view.setTag(R$id.binding_reference, t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> T getBinding(View view) {
        Object tag = view.getTag(R$id.binding_reference);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachFragmentContainerView(ViewGroup viewGroup, Function1<? super FragmentContainerView, Unit> function1) {
        if (!(viewGroup instanceof FragmentContainerView)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    forEachFragmentContainerView((ViewGroup) childAt, function1);
                }
            }
            return;
        }
        function1.invoke(viewGroup);
    }
}
