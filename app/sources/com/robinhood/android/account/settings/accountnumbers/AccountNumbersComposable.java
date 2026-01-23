package com.robinhood.android.account.settings.accountnumbers;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire.proto.idl.accounts.p028v1.AccountNumbersAction;
import bonfire.proto.idl.accounts.p028v1.AccountNumbersActionDto;
import com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposable;
import com.robinhood.android.account.settings.accountnumbers.AccountNumbersViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.compose.ClipboardUtil;
import com.robinhood.utils.compose.ClipboardUtil2;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.ProtoAdapter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.AlertDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: AccountNumbersComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"AccountNumbersScreen", "", "viewState", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-account-number-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountNumbersComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountNumbersScreen$lambda$0(AccountNumbersViewState accountNumbersViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountNumbersScreen(accountNumbersViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountNumbersScreen(final AccountNumbersViewState viewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-982890368);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-982890368, i3, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen (AccountNumbersComposable.kt:26)");
                }
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(1960022340, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt.AccountNumbersScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1960022340, i5, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen.<anonymous> (AccountNumbersComposable.kt:30)");
                        }
                        final AccountNumbersViewState accountNumbersViewState = viewState;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-849353807, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt.AccountNumbersScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-849353807, i6, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen.<anonymous>.<anonymous> (AccountNumbersComposable.kt:32)");
                                }
                                AccountNumbersViewState accountNumbersViewState2 = accountNumbersViewState;
                                if (accountNumbersViewState2 instanceof AccountNumbersViewState.Loaded) {
                                    BentoText2.m20747BentoText38GnDrw(((AccountNumbersViewState.Loaded) accountNumbersViewState2).getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextL(), composer4, 0, 0, 8190);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, AccountNumbersComposable4.INSTANCE.m1700x5c50f055(), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1334739185, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt.AccountNumbersScreen.2

                    /* compiled from: AccountNumbersComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$AccountNumbersScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ PaddingValues $paddingValues;
                        final /* synthetic */ AccountNumbersViewState $viewState;

                        AnonymousClass1(AccountNumbersViewState accountNumbersViewState, PaddingValues paddingValues) {
                            this.$viewState = accountNumbersViewState;
                            this.$paddingValues = paddingValues;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1432657492, i, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen.<anonymous>.<anonymous> (AccountNumbersComposable.kt:79)");
                            }
                            ImmutableList<UIComponentDto> content = ((AccountNumbersViewState.Loaded) this.$viewState).getContent();
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, this.$paddingValues);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$AccountNumbersScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AccountNumbersComposable.C81622.AnonymousClass1.invoke$lambda$2$lambda$1((ActionDto) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1370740990);
                            SduiColumnsIdl.SduiLazyColumn(content, AccountNumbersActionDto.class, (Function1) objRememberedValue, modifierPadding, LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3), null, null, HorizontalPadding.Default, true, composer, 100663680, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final AccountNumbersActionDto invoke$lambda$2$lambda$1(ActionDto actionDto) {
                            ByteString value;
                            if (actionDto == null) {
                                return null;
                            }
                            AccountNumbersActionDto.Companion companion = AccountNumbersActionDto.INSTANCE;
                            ProtoAdapter<AccountNumbersAction> protoAdapter = companion.getProtoAdapter();
                            AnyMessage concrete = actionDto.getConcrete();
                            if (concrete == null || (value = concrete.getValue()) == null) {
                                value = ByteString.EMPTY;
                            }
                            return companion.fromProto(protoAdapter.decode(value));
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 6) == 0) {
                            i6 = (composer3.changed(paddingValues) ? 4 : 2) | i5;
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1334739185, i6, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen.<anonymous> (AccountNumbersComposable.kt:46)");
                        }
                        AccountNumbersViewState accountNumbersViewState = viewState;
                        if (accountNumbersViewState instanceof AccountNumbersViewState.Loading) {
                            composer3.startReplaceGroup(-407734331);
                            LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), false, false, 0, composer3, 0, 14);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(accountNumbersViewState instanceof AccountNumbersViewState.Loaded)) {
                                composer3.startReplaceGroup(1510867696);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-407490206);
                            final ClipboardUtil clipboardUtil = ClipboardUtil2.clipboardUtil(composer3, 0);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer3);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                            SduiActionHandler3.ProvideActionHandler(null, new DtoActionHandler<AccountNumbersActionDto>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$AccountNumbersScreen$2$dtoActionHandler$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                public AccountNumbersActionDto convertAlertToAction(AlertDto alertDto) {
                                    return (AccountNumbersActionDto) DtoActionHandler.DefaultImpls.convertAlertToAction(this, alertDto);
                                }

                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                /* renamed from: handle-RsTtcXE, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
                                public boolean mo10782handleRsTtcXE(AccountNumbersActionDto action, GenericAlertMobilePresentationStyle alertType, int textAlign) {
                                    Intrinsics.checkNotNullParameter(action, "action");
                                    Intrinsics.checkNotNullParameter(alertType, "alertType");
                                    AccountNumbersActionDto.ActionDto action2 = action.getAction();
                                    if (action2 instanceof AccountNumbersActionDto.ActionDto.CopyText) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountNumbersComposable3(clipboardUtil, action2, null), 3, null);
                                        return true;
                                    }
                                    if (action2 == null) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            }, ComposableLambda3.rememberComposableLambda(-1432657492, true, new AnonymousClass1(viewState, paddingValues), composer3, 54), composer3, 390, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountNumbersComposable.AccountNumbersScreen$lambda$0(viewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(1960022340, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt.AccountNumbersScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1960022340, i5, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen.<anonymous> (AccountNumbersComposable.kt:30)");
                    }
                    final AccountNumbersViewState accountNumbersViewState = viewState;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-849353807, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt.AccountNumbersScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-849353807, i6, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen.<anonymous>.<anonymous> (AccountNumbersComposable.kt:32)");
                            }
                            AccountNumbersViewState accountNumbersViewState2 = accountNumbersViewState;
                            if (accountNumbersViewState2 instanceof AccountNumbersViewState.Loaded) {
                                BentoText2.m20747BentoText38GnDrw(((AccountNumbersViewState.Loaded) accountNumbersViewState2).getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextL(), composer4, 0, 0, 8190);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, AccountNumbersComposable4.INSTANCE.m1700x5c50f055(), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1334739185, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt.AccountNumbersScreen.2

                /* compiled from: AccountNumbersComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$AccountNumbersScreen$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ PaddingValues $paddingValues;
                    final /* synthetic */ AccountNumbersViewState $viewState;

                    AnonymousClass1(AccountNumbersViewState accountNumbersViewState, PaddingValues paddingValues) {
                        this.$viewState = accountNumbersViewState;
                        this.$paddingValues = paddingValues;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1432657492, i, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen.<anonymous>.<anonymous> (AccountNumbersComposable.kt:79)");
                        }
                        ImmutableList<UIComponentDto> content = ((AccountNumbersViewState.Loaded) this.$viewState).getContent();
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, this.$paddingValues);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$AccountNumbersScreen$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountNumbersComposable.C81622.AnonymousClass1.invoke$lambda$2$lambda$1((ActionDto) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1370740990);
                        SduiColumnsIdl.SduiLazyColumn(content, AccountNumbersActionDto.class, (Function1) objRememberedValue, modifierPadding, LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3), null, null, HorizontalPadding.Default, true, composer, 100663680, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final AccountNumbersActionDto invoke$lambda$2$lambda$1(ActionDto actionDto) {
                        ByteString value;
                        if (actionDto == null) {
                            return null;
                        }
                        AccountNumbersActionDto.Companion companion = AccountNumbersActionDto.INSTANCE;
                        ProtoAdapter<AccountNumbersAction> protoAdapter = companion.getProtoAdapter();
                        AnyMessage concrete = actionDto.getConcrete();
                        if (concrete == null || (value = concrete.getValue()) == null) {
                            value = ByteString.EMPTY;
                        }
                        return companion.fromProto(protoAdapter.decode(value));
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 6) == 0) {
                        i6 = (composer3.changed(paddingValues) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1334739185, i6, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersScreen.<anonymous> (AccountNumbersComposable.kt:46)");
                    }
                    AccountNumbersViewState accountNumbersViewState = viewState;
                    if (accountNumbersViewState instanceof AccountNumbersViewState.Loading) {
                        composer3.startReplaceGroup(-407734331);
                        LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), false, false, 0, composer3, 0, 14);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(accountNumbersViewState instanceof AccountNumbersViewState.Loaded)) {
                            composer3.startReplaceGroup(1510867696);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-407490206);
                        final ClipboardUtil clipboardUtil = ClipboardUtil2.clipboardUtil(composer3, 0);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer3);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                        SduiActionHandler3.ProvideActionHandler(null, new DtoActionHandler<AccountNumbersActionDto>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$AccountNumbersScreen$2$dtoActionHandler$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                            public AccountNumbersActionDto convertAlertToAction(AlertDto alertDto) {
                                return (AccountNumbersActionDto) DtoActionHandler.DefaultImpls.convertAlertToAction(this, alertDto);
                            }

                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                            /* renamed from: handle-RsTtcXE, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
                            public boolean mo10782handleRsTtcXE(AccountNumbersActionDto action, GenericAlertMobilePresentationStyle alertType, int textAlign) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                Intrinsics.checkNotNullParameter(alertType, "alertType");
                                AccountNumbersActionDto.ActionDto action2 = action.getAction();
                                if (action2 instanceof AccountNumbersActionDto.ActionDto.CopyText) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountNumbersComposable3(clipboardUtil, action2, null), 3, null);
                                    return true;
                                }
                                if (action2 == null) {
                                    return false;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }, ComposableLambda3.rememberComposableLambda(-1432657492, true, new AnonymousClass1(viewState, paddingValues), composer3, 54), composer3, 390, 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
