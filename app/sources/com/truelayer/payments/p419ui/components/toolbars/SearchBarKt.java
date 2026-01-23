package com.truelayer.payments.p419ui.components.toolbars;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.BackButton;
import com.truelayer.payments.p419ui.models.QueryState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SearchBar.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001ak\u0010\u000e\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0080\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0084\u0001\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aG\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0003¢\u0006\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"", "title", "hint", "", "inline", "Lcom/truelayer/payments/ui/models/QueryState;", "query", "Lkotlin/Function1;", "", "onChange", "Lkotlin/Function0;", "onBack", "Lcom/truelayer/payments/ui/components/toolbars/AccessibleAppBarAction;", "action", "SearchBar", "(Ljava/lang/String;Ljava/lang/String;ZLcom/truelayer/payments/ui/models/QueryState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/truelayer/payments/ui/components/toolbars/AccessibleAppBarAction;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/ParameterName;", "name", "value", "onClear", "SearchContainer", "(Landroidx/compose/ui/Modifier;ZLcom/truelayer/payments/ui/models/QueryState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/truelayer/payments/ui/components/toolbars/AccessibleAppBarAction;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "shouldRequestFocus", "SearchingView", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/focus/FocusRequester;ZLandroidx/compose/runtime/Composer;II)V", "onClick", "SearchButton", "(Lcom/truelayer/payments/ui/models/QueryState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "navigationIcon", "(Lcom/truelayer/payments/ui/models/QueryState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SearchBarKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchBar(final String str, final String str2, boolean z, QueryState queryState, Function1<? super QueryState, Unit> function1, Function0<Unit> function0, AccessibleAppBarAction accessibleAppBarAction, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        boolean z2;
        final QueryState queryStateMo27021default;
        int i5;
        final Function1<? super QueryState, Unit> function12;
        int i6;
        Function0<Unit> function02;
        int i7;
        final AccessibleAppBarAction accessibleAppBarAction2;
        Composer composer2;
        final boolean z3;
        final QueryState queryState2;
        final Function1<? super QueryState, Unit> function13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500789519);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 14) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        queryStateMo27021default = queryState;
                        int i8 = composerStartRestartGroup.changed(queryStateMo27021default) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        queryStateMo27021default = queryState;
                    }
                    i3 |= i8;
                } else {
                    queryStateMo27021default = queryState;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((57344 & i) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((458752 & i) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 == 0) {
                            if ((3670016 & i) == 0) {
                                accessibleAppBarAction2 = accessibleAppBarAction;
                                i3 |= composerStartRestartGroup.changed(accessibleAppBarAction2) ? 1048576 : 524288;
                            }
                            if ((2995931 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        z2 = false;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        queryStateMo27021default = QueryState.INSTANCE.mo27021default();
                                    }
                                    if (i5 != 0) {
                                        function12 = new Function1<QueryState, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchBar.1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(QueryState it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(QueryState queryState3) {
                                                invoke2(queryState3);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                    }
                                    if (i6 != 0) {
                                        function02 = null;
                                    }
                                    if (i7 != 0) {
                                        accessibleAppBarAction2 = null;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1500789519, i3, -1, "com.truelayer.payments.ui.components.toolbars.SearchBar (SearchBar.kt:38)");
                                }
                                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final QueryState queryState3 = queryStateMo27021default;
                                final String str5 = str4;
                                final boolean z4 = z2;
                                final Function1<? super QueryState, Unit> function14 = function12;
                                final AccessibleAppBarAction accessibleAppBarAction3 = accessibleAppBarAction2;
                                AccessibleTopAppBar2.AccessibleTopAppBar(SemanticsModifier6.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchBar.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        String string2 = context.getString(C42830R.string.search);
                                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                        final Function1<QueryState, Unit> function15 = function12;
                                        final QueryState queryState4 = queryStateMo27021default;
                                        CustomAccessibilityAction customAccessibilityAction = new CustomAccessibilityAction(string2, new Function0<Boolean>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchBar.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                function15.invoke(new QueryState.Focused(queryState4.getInner()));
                                                return Boolean.TRUE;
                                            }
                                        });
                                        AccessibleAppBarAction accessibleAppBarAction4 = accessibleAppBarAction2;
                                        SemanticsPropertiesKt.setCustomActions(semantics, CollectionsKt.listOfNotNull((Object[]) new CustomAccessibilityAction[]{customAccessibilityAction, accessibleAppBarAction4 != null ? accessibleAppBarAction4.getAccessibilityAction() : null}));
                                    }
                                }, 1, null), str3, navigationIcon(queryState3, function12, function02, composerStartRestartGroup, (i3 >> 9) & 1022, 0), ComposableLambda3.composableLambda(composerStartRestartGroup, -1441417034, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchBar.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                        invoke(row5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 AccessibleTopAppBar, Composer composer3, int i9) {
                                        Intrinsics.checkNotNullParameter(AccessibleTopAppBar, "$this$AccessibleTopAppBar");
                                        if ((i9 & 81) != 16 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1441417034, i9, -1, "com.truelayer.payments.ui.components.toolbars.SearchBar.<anonymous> (SearchBar.kt:58)");
                                            }
                                            String strStringResource = str5;
                                            composer3.startReplaceableGroup(-1313715622);
                                            if (strStringResource == null) {
                                                strStringResource = StringResources_androidKt.stringResource(C42830R.string.search, composer3, 0);
                                            }
                                            String str6 = strStringResource;
                                            composer3.endReplaceableGroup();
                                            boolean z5 = z4;
                                            QueryState queryState4 = queryState3;
                                            Function1<QueryState, Unit> function15 = function14;
                                            composer3.startReplaceableGroup(-1313715518);
                                            boolean zChanged = composer3.changed(function14);
                                            final Function1<QueryState, Unit> function16 = function14;
                                            Object objRememberedValue = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt$SearchBar$3$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(String str7) {
                                                        invoke2(str7);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(String value) {
                                                        Intrinsics.checkNotNullParameter(value, "value");
                                                        function16.invoke(value.length() == 0 ? new QueryState.UnFocused("") : new QueryState.Focused(""));
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue);
                                            }
                                            composer3.endReplaceableGroup();
                                            SearchBarKt.SearchContainer(null, z5, queryState4, str6, function15, (Function1) objRememberedValue, accessibleAppBarAction3, composer3, CustomAccessibilityAction.$stable << 18, 1);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, ((i3 << 3) & 112) | 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = composerStartRestartGroup;
                                z3 = z4;
                                queryState2 = queryState3;
                                function13 = function14;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                z3 = z2;
                                queryState2 = queryStateMo27021default;
                                function13 = function12;
                            }
                            final Function0<Unit> function03 = function02;
                            final AccessibleAppBarAction accessibleAppBarAction4 = accessibleAppBarAction2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchBar.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        SearchBarKt.SearchBar(str, str2, z3, queryState2, function13, function03, accessibleAppBarAction4, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        accessibleAppBarAction2 = accessibleAppBarAction;
                        if ((2995931 & i3) == 599186) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final QueryState queryState32 = queryStateMo27021default;
                                final String str52 = str4;
                                final boolean z42 = z2;
                                final Function1<? super QueryState, Unit> function142 = function12;
                                final AccessibleAppBarAction accessibleAppBarAction32 = accessibleAppBarAction2;
                                AccessibleTopAppBar2.AccessibleTopAppBar(SemanticsModifier6.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchBar.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        String string2 = context2.getString(C42830R.string.search);
                                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                        final Function1<? super QueryState, Unit> function15 = function12;
                                        final QueryState queryState4 = queryStateMo27021default;
                                        CustomAccessibilityAction customAccessibilityAction = new CustomAccessibilityAction(string2, new Function0<Boolean>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchBar.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                function15.invoke(new QueryState.Focused(queryState4.getInner()));
                                                return Boolean.TRUE;
                                            }
                                        });
                                        AccessibleAppBarAction accessibleAppBarAction42 = accessibleAppBarAction2;
                                        SemanticsPropertiesKt.setCustomActions(semantics, CollectionsKt.listOfNotNull((Object[]) new CustomAccessibilityAction[]{customAccessibilityAction, accessibleAppBarAction42 != null ? accessibleAppBarAction42.getAccessibilityAction() : null}));
                                    }
                                }, 1, null), str3, navigationIcon(queryState32, function12, function02, composerStartRestartGroup, (i3 >> 9) & 1022, 0), ComposableLambda3.composableLambda(composerStartRestartGroup, -1441417034, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchBar.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                        invoke(row5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 AccessibleTopAppBar, Composer composer3, int i9) {
                                        Intrinsics.checkNotNullParameter(AccessibleTopAppBar, "$this$AccessibleTopAppBar");
                                        if ((i9 & 81) != 16 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1441417034, i9, -1, "com.truelayer.payments.ui.components.toolbars.SearchBar.<anonymous> (SearchBar.kt:58)");
                                            }
                                            String strStringResource = str52;
                                            composer3.startReplaceableGroup(-1313715622);
                                            if (strStringResource == null) {
                                                strStringResource = StringResources_androidKt.stringResource(C42830R.string.search, composer3, 0);
                                            }
                                            String str6 = strStringResource;
                                            composer3.endReplaceableGroup();
                                            boolean z5 = z42;
                                            QueryState queryState4 = queryState32;
                                            Function1<QueryState, Unit> function15 = function142;
                                            composer3.startReplaceableGroup(-1313715518);
                                            boolean zChanged = composer3.changed(function142);
                                            final Function1<? super QueryState, Unit> function16 = function142;
                                            Object objRememberedValue = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt$SearchBar$3$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(String str7) {
                                                        invoke2(str7);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(String value) {
                                                        Intrinsics.checkNotNullParameter(value, "value");
                                                        function16.invoke(value.length() == 0 ? new QueryState.UnFocused("") : new QueryState.Focused(""));
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue);
                                            }
                                            composer3.endReplaceableGroup();
                                            SearchBarKt.SearchContainer(null, z5, queryState4, str6, function15, (Function1) objRememberedValue, accessibleAppBarAction32, composer3, CustomAccessibilityAction.$stable << 18, 1);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, ((i3 << 3) & 112) | 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer2 = composerStartRestartGroup;
                                z3 = z42;
                                queryState2 = queryState32;
                                function13 = function142;
                            }
                        }
                        final Function0<Unit> function032 = function02;
                        final AccessibleAppBarAction accessibleAppBarAction42 = accessibleAppBarAction2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function02 = function0;
                    i7 = i2 & 64;
                    if (i7 == 0) {
                    }
                    accessibleAppBarAction2 = accessibleAppBarAction;
                    if ((2995931 & i3) == 599186) {
                    }
                    final Function0<Unit> function0322 = function02;
                    final AccessibleAppBarAction accessibleAppBarAction422 = accessibleAppBarAction2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function02 = function0;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                accessibleAppBarAction2 = accessibleAppBarAction;
                if ((2995931 & i3) == 599186) {
                }
                final Function0<Unit> function03222 = function02;
                final AccessibleAppBarAction accessibleAppBarAction4222 = accessibleAppBarAction2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function12 = function1;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function02 = function0;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            accessibleAppBarAction2 = accessibleAppBarAction;
            if ((2995931 & i3) == 599186) {
            }
            final Function0<Unit> function032222 = function02;
            final AccessibleAppBarAction accessibleAppBarAction42222 = accessibleAppBarAction2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str4 = str2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function12 = function1;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function02 = function0;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        accessibleAppBarAction2 = accessibleAppBarAction;
        if ((2995931 & i3) == 599186) {
        }
        final Function0<Unit> function0322222 = function02;
        final AccessibleAppBarAction accessibleAppBarAction422222 = accessibleAppBarAction2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchingView(Modifier modifier, String str, final String hint, boolean z, Function1<? super String, Unit> function1, final Function1<? super QueryState, Unit> onChange, FocusRequester focusRequester, boolean z2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int i4;
        boolean z3;
        int i5;
        Function1<? super String, Unit> function12;
        int i6;
        int i7;
        int i8;
        final FocusRequester focusRequester2;
        boolean z4;
        boolean z5;
        Object objRememberedValue;
        final String str3;
        final boolean z6;
        final Function1<? super String, Unit> function13;
        Composer composer2;
        final FocusRequester focusRequester3;
        final boolean z7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(2101034658);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(hint) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((57344 & i) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    if ((i2 & 32) != 0) {
                        i9 = (i & 458752) == 0 ? composerStartRestartGroup.changedInstance(onChange) ? 131072 : 65536 : 196608;
                        i6 = i2 & 64;
                        if (i6 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= composerStartRestartGroup.changed(focusRequester) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 == 0) {
                            if ((i & 29360128) == 0) {
                                i8 = i7;
                                i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                            }
                            if ((i3 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                String str4 = i11 == 0 ? "" : str2;
                                boolean z8 = i4 == 0 ? false : z3;
                                Function1<? super String, Unit> function14 = i5 == 0 ? null : function12;
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-2034653761);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new FocusRequester();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    focusRequester2 = (FocusRequester) objRememberedValue2;
                                } else {
                                    focusRequester2 = focusRequester;
                                }
                                z4 = i8 == 0 ? true : z2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2101034658, i3, -1, "com.truelayer.payments.ui.components.toolbars.SearchingView (SearchBar.kt:116)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(-2034653683);
                                if (z4) {
                                    composerStartRestartGroup.startReplaceableGroup(-2034653638);
                                    boolean z9 = (i3 & 3670016) == 1048576;
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (z9 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt$SearchingView$2$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                focusRequester2.requestFocus();
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(modifier4, C2002Dp.m7995constructorimpl(48), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), focusRequester2);
                                composerStartRestartGroup.startReplaceableGroup(-2034653309);
                                z5 = (i3 & 458752) == 131072;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt$SearchingView$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                                            invoke2(str5);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(String updatedValue) {
                                            Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
                                            onChange.invoke(new QueryState.Focused(updatedValue));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                SearchField2.SearchField(modifierFocusRequester, str4, hint, z8, null, (Function1) objRememberedValue, function14, composerStartRestartGroup, (i3 & 8176) | ((i3 << 6) & 3670016), 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str3 = str4;
                                z6 = z8;
                                function13 = function14;
                                composer2 = composerStartRestartGroup;
                                focusRequester3 = focusRequester2;
                                z7 = z4;
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z7 = z2;
                                modifier3 = modifier2;
                                str3 = str2;
                                composer2 = composerStartRestartGroup;
                                z6 = z3;
                                function13 = function12;
                                focusRequester3 = focusRequester;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchingView.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        SearchBarKt.SearchingView(modifier3, str3, hint, z6, function13, onChange, focusRequester3, z7, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i8 = i7;
                        if ((i3 & 23967451) == 4793490) {
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(-2034653683);
                            if (z4) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierFocusRequester2 = FocusRequesterModifier3.focusRequester(SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(modifier4, C2002Dp.m7995constructorimpl(48), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), focusRequester2);
                            composerStartRestartGroup.startReplaceableGroup(-2034653309);
                            if ((i3 & 458752) == 131072) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z5) {
                                objRememberedValue = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt$SearchingView$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                                        invoke2(str5);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String updatedValue) {
                                        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
                                        onChange.invoke(new QueryState.Focused(updatedValue));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceableGroup();
                                SearchField2.SearchField(modifierFocusRequester2, str4, hint, z8, null, (Function1) objRememberedValue, function14, composerStartRestartGroup, (i3 & 8176) | ((i3 << 6) & 3670016), 16);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str3 = str4;
                                z6 = z8;
                                function13 = function14;
                                composer2 = composerStartRestartGroup;
                                focusRequester3 = focusRequester2;
                                z7 = z4;
                                modifier3 = modifier4;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i3 |= i9;
                    i6 = i2 & 64;
                    if (i6 != 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                    }
                    i8 = i7;
                    if ((i3 & 23967451) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                if ((i2 & 32) != 0) {
                }
                i3 |= i9;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i3 & 23967451) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function12 = function1;
            if ((i2 & 32) != 0) {
            }
            i3 |= i9;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i3 & 23967451) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str2 = str;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((i2 & 32) != 0) {
        }
        i3 |= i9;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i3 & 23967451) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void SearchButton(final QueryState queryState, final Function1<? super QueryState, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1485598260);
        if ((i & 14) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(queryState)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    queryState = QueryState.INSTANCE.mo27021default();
                    i3 &= -15;
                }
                if (i4 != 0) {
                    function1 = new Function1<QueryState, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchButton.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(QueryState it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(QueryState queryState2) {
                            invoke2(queryState2);
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485598260, i3, -1, "com.truelayer.payments.ui.components.toolbars.SearchButton (SearchBar.kt:141)");
            }
            Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchButton.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver clearAndSetSemantics) {
                    Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            });
            composerStartRestartGroup.startReplaceableGroup(587511455);
            boolean z = ((i3 & 112) == 32) | ((((i3 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(queryState)) || (i3 & 6) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt$SearchButton$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function1.invoke(new QueryState.Focused(queryState.getInner()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            IconButton5.IconButton((Function0) objRememberedValue, modifierClearAndSetSemantics, false, null, null, ComposableSingletons$SearchBarKt.INSTANCE.m27069getLambda1$payments_ui_release(), composerStartRestartGroup, 196608, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchButton.4
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

                public final void invoke(Composer composer2, int i5) {
                    SearchBarKt.SearchButton(queryState, function1, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    private static final Function2<Composer, Integer, Unit> navigationIcon(final QueryState queryState, final Function1<? super QueryState, Unit> function1, final Function0<Unit> function0, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2105580507);
        if ((i2 & 1) != 0) {
            queryState = QueryState.INSTANCE.mo27021default();
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<QueryState, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.navigationIcon.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(QueryState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QueryState queryState2) {
                    invoke2(queryState2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2105580507, i, -1, "com.truelayer.payments.ui.components.toolbars.navigationIcon (SearchBar.kt:156)");
        }
        if (function0 == null) {
            Function2<Composer, Integer, Unit> function2M27070getLambda2$payments_ui_release = ComposableSingletons$SearchBarKt.INSTANCE.m27070getLambda2$payments_ui_release();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function2M27070getLambda2$payments_ui_release;
        }
        ComposableLambda composableLambda = ComposableLambda3.composableLambda(composer, 1091654494, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.navigationIcon.2
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

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1091654494, i3, -1, "com.truelayer.payments.ui.components.toolbars.navigationIcon.<anonymous> (SearchBar.kt:160)");
                }
                composer2.startReplaceableGroup(-1541055236);
                boolean zChanged = composer2.changed(queryState) | composer2.changed(function1) | composer2.changed(function0);
                final QueryState queryState2 = queryState;
                final Function1<QueryState, Unit> function12 = function1;
                final Function0<Unit> function02 = function0;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt$navigationIcon$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            QueryState queryState3 = queryState2;
                            if (queryState3 instanceof QueryState.Focused) {
                                function12.invoke(new QueryState.UnFocused(""));
                            } else if (queryState3 instanceof QueryState.UnFocused) {
                                function02.invoke();
                            }
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                BackButton.BackButton(null, null, (Function0) objRememberedValue, composer2, 0, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchContainer(Modifier modifier, boolean z, QueryState queryState, String str, Function1<? super QueryState, Unit> function1, Function1<? super String, Unit> function12, AccessibleAppBarAction accessibleAppBarAction, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        QueryState queryStateMo27021default;
        String strStringResource;
        Function1<? super QueryState, Unit> function13;
        int i4;
        Function1<? super String, Unit> function14;
        int i5;
        int i6;
        AccessibleAppBarAction accessibleAppBarAction2;
        Modifier modifier2;
        boolean z3;
        Function1<? super QueryState, Unit> function15;
        String str2;
        AccessibleAppBarAction accessibleAppBarAction3;
        Function1<? super String, Unit> function16;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        final QueryState queryState2;
        final boolean z4;
        final Function1<? super String, Unit> function17;
        final Function1<? super QueryState, Unit> function18;
        final AccessibleAppBarAction accessibleAppBarAction4;
        final String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1202424494);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i | 48;
            z2 = z;
        } else if ((i & 112) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 32 : 16) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                queryStateMo27021default = queryState;
                int i8 = composerStartRestartGroup.changed(queryStateMo27021default) ? 256 : 128;
                i3 |= i8;
            } else {
                queryStateMo27021default = queryState;
            }
            i3 |= i8;
        } else {
            queryStateMo27021default = queryState;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                strStringResource = str;
                int i9 = composerStartRestartGroup.changed(strStringResource) ? 2048 : 1024;
                i3 |= i9;
            } else {
                strStringResource = str;
            }
            i3 |= i9;
        } else {
            strStringResource = str;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 57344) == 0) {
                function13 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((i & 458752) == 0) {
                    function14 = function12;
                    i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    i6 = 57344;
                    accessibleAppBarAction2 = accessibleAppBarAction;
                } else {
                    i6 = 57344;
                    accessibleAppBarAction2 = accessibleAppBarAction;
                    if ((i & 3670016) == 0) {
                        i3 |= composerStartRestartGroup.changed(accessibleAppBarAction2) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 2995921) == 599184 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    composer2 = composerStartRestartGroup;
                    z4 = z2;
                    queryState2 = queryStateMo27021default;
                    str3 = strStringResource;
                    accessibleAppBarAction4 = accessibleAppBarAction2;
                    function18 = function13;
                    function17 = function14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier2 = (i2 & 1) == 0 ? Modifier.INSTANCE : modifier;
                        if (i7 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            queryStateMo27021default = QueryState.INSTANCE.mo27021default();
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            strStringResource = StringResources_androidKt.stringResource(C42830R.string.search, composerStartRestartGroup, 0);
                        }
                        if (i10 != 0) {
                            function13 = new Function1<QueryState, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchContainer.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(QueryState it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(QueryState queryState3) {
                                    invoke2(queryState3);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                        if (i4 != 0) {
                            function14 = null;
                        }
                        if (i5 == 0) {
                            str2 = strStringResource;
                            accessibleAppBarAction3 = null;
                            function16 = function14;
                            function15 = function13;
                            z3 = z2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1202424494, i3, -1, "com.truelayer.payments.ui.components.toolbars.SearchContainer (SearchBar.kt:83)");
                            }
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor);
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier4 = modifier2;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            Row6 row6 = Row6.INSTANCE;
                            if ((queryStateMo27021default instanceof QueryState.Focused) && StringsKt.isBlank(queryStateMo27021default.getInner())) {
                                composerStartRestartGroup.startReplaceableGroup(-1686432766);
                                SearchButton(queryStateMo27021default, function15, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 9) & 112), 0);
                                Function2<Composer, Integer, Unit> component = accessibleAppBarAction3 != null ? accessibleAppBarAction3.getComponent() : null;
                                if (component != null) {
                                    component.invoke(composerStartRestartGroup, 0);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composer2 = composerStartRestartGroup;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1686433062);
                                int i11 = i3 >> 3;
                                composer2 = composerStartRestartGroup;
                                SearchingView(null, queryStateMo27021default.getInner(), str2, z3, function16, function15, null, queryStateMo27021default instanceof QueryState.Focused, composer2, (i11 & i6) | (i11 & 896) | ((i3 << 6) & 7168) | ((i3 << 3) & 458752), 65);
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            queryState2 = queryStateMo27021default;
                            z4 = z3;
                            function17 = function16;
                            function18 = function15;
                            accessibleAppBarAction4 = accessibleAppBarAction3;
                            str3 = str2;
                        } else {
                            Function1<? super QueryState, Unit> function19 = function13;
                            z3 = z2;
                            function15 = function19;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        Function1<? super QueryState, Unit> function110 = function13;
                        z3 = z2;
                        function15 = function110;
                        modifier2 = modifier;
                    }
                    accessibleAppBarAction3 = accessibleAppBarAction2;
                    function16 = function14;
                    str2 = strStringResource;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Modifier modifier42 = modifier2;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Row6 row62 = Row6.INSTANCE;
                        if (queryStateMo27021default instanceof QueryState.Focused) {
                            composerStartRestartGroup.startReplaceableGroup(-1686433062);
                            int i112 = i3 >> 3;
                            composer2 = composerStartRestartGroup;
                            SearchingView(null, queryStateMo27021default.getInner(), str2, z3, function16, function15, null, queryStateMo27021default instanceof QueryState.Focused, composer2, (i112 & i6) | (i112 & 896) | ((i3 << 6) & 7168) | ((i3 << 3) & 458752), 65);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            queryState2 = queryStateMo27021default;
                            z4 = z3;
                            function17 = function16;
                            function18 = function15;
                            accessibleAppBarAction4 = accessibleAppBarAction3;
                            str3 = str2;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchBarKt.SearchContainer.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i12) {
                            SearchBarKt.SearchContainer(modifier3, z4, queryState2, str3, function18, function17, accessibleAppBarAction4, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function14 = function12;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i3 & 2995921) == 599184) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 1) == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function13 = function1;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function14 = function12;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i3 & 2995921) == 599184) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
