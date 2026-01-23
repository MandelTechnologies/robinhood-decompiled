package com.robinhood.shared.agreements.agreementsscreen;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreen4;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementViewState;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.shared.common.agreementview.AgreementScaffold;
import com.robinhood.shared.common.agreementview.MarkdownTextAgreement;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: IdentiAgreementScreen.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001am\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\u0012\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eX\u008a\u0084\u0002"}, m3636d2 = {"AgreementLoadingTestTag", "", "AgreementErrorTestTag", "IdentiAgreementScreen", "", "identiAgreementType", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "accountNumber", "onBackClicked", "Lkotlin/Function0;", "onEvent", "Lkotlin/Function1;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "overrideButtonText", "buttonDisclosureText", "duxo", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDuxo;", "(Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "PreviewLoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "lib-agreements-screen_externalDebug", "viewState", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState;", "events", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class IdentiAgreementScreen4 {
    public static final String AgreementErrorTestTag = "agreement_error";
    public static final String AgreementLoadingTestTag = "agreement_loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IdentiAgreementScreen$lambda$3(IdentiAgreementType identiAgreementType, String str, Function0 function0, Function1 function1, Modifier modifier, String str2, String str3, IdentiAgreementDuxo identiAgreementDuxo, int i, int i2, Composer composer, int i3) {
        IdentiAgreementScreen(identiAgreementType, str, function0, function1, modifier, str2, str3, identiAgreementDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$4(PaddingValues paddingValues, int i, Composer composer, int i2) {
        LoadingContent(paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingContent$lambda$5(int i, Composer composer, int i2) {
        PreviewLoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IdentiAgreementScreen(final IdentiAgreementType identiAgreementType, final String str, final Function0<Unit> onBackClicked, final Function1<? super IdentiAgreementEvent, Unit> onEvent, Modifier modifier, String str2, String str3, IdentiAgreementDuxo identiAgreementDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str4;
        int i5;
        String str5;
        int i6;
        IdentiAgreementDuxo identiAgreementDuxo2;
        int i7;
        Modifier modifier3;
        String str6;
        int i8;
        String str7;
        IdentiAgreementDuxo identiAgreementDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        final Event<IdentiAgreementEvent> eventIdentiAgreementScreen$lambda$1;
        final Modifier modifier4;
        final IdentiAgreementDuxo identiAgreementDuxo4;
        final String str8;
        final String str9;
        EventConsumer<IdentiAgreementEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(identiAgreementType, "identiAgreementType");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-107991695);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(identiAgreementType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEvent) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    str4 = str2;
                    i3 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((i & 1572864) == 0) {
                        str5 = str3;
                        i3 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 1572864;
                        if ((i2 & 128) == 0) {
                            identiAgreementDuxo2 = identiAgreementDuxo;
                            int i10 = composerStartRestartGroup.changedInstance(identiAgreementDuxo2) ? 8388608 : 4194304;
                            i3 |= i10;
                        } else {
                            identiAgreementDuxo2 = identiAgreementDuxo;
                        }
                        i3 |= i10;
                    } else {
                        i6 = 1572864;
                        identiAgreementDuxo2 = identiAgreementDuxo;
                    }
                    i7 = i3;
                    if ((i7 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            String str10 = i4 == 0 ? null : str4;
                            str6 = i5 == 0 ? null : str5;
                            if ((i2 & 128) == 0) {
                                String str11 = "IdentiAgreementDuxo: " + identiAgreementType.getServerValue();
                                IdentiAgreementDuxo.InitArgs initArgs = new IdentiAgreementDuxo.InitArgs(identiAgreementType, str);
                                composerStartRestartGroup.startReplaceGroup(2050738472);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                                creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IdentiAgreementDuxo.class), current, str11, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$IdentiAgreementScreen$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$IdentiAgreementScreen$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                i8 = i7 & (-29360129);
                                str7 = str10;
                                identiAgreementDuxo3 = (IdentiAgreementDuxo) baseDuxo;
                            } else {
                                i8 = i7;
                                str7 = str10;
                                identiAgreementDuxo3 = identiAgreementDuxo2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i7 &= -29360129;
                            }
                            modifier3 = modifier2;
                            str7 = str4;
                            str6 = str5;
                            identiAgreementDuxo3 = identiAgreementDuxo2;
                            i8 = i7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-107991695, i8, -1, "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreen (IdentiAgreementScreen.kt:42)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(identiAgreementDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        eventIdentiAgreementScreen$lambda$1 = IdentiAgreementScreen$lambda$1(FlowExtKt.collectAsStateWithLifecycle(identiAgreementDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                        if (eventIdentiAgreementScreen$lambda$1 != null && (eventIdentiAgreementScreen$lambda$1.getData() instanceof IdentiAgreementEvent) && (eventConsumerInvoke = eventIdentiAgreementScreen$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventIdentiAgreementScreen$lambda$1, new Function1() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$IdentiAgreementScreen$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m24774invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m24774invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onEvent.invoke((IdentiAgreementEvent) eventIdentiAgreementScreen$lambda$1.getData());
                                }
                            });
                        }
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        int i11 = BentoMarkdownText.$stable;
                        MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(bentoMarkdownText.getStyle(composerStartRestartGroup, i11), null, null, MarkdownStyle.BulletList.copy$default(bentoMarkdownText.getStyle(composerStartRestartGroup, i11).getBulletList(), (char) 0, (char) 0, (char) 0, "\t\t", 7, null), null, null, null, null, 0L, null, 0, null, 2043, null);
                        Composer composer2 = composerStartRestartGroup;
                        modifier4 = modifier3;
                        AgreementScaffold.AgreementScaffold(StringResource2.getString(IdentiAgreementScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAgreementTitleRes(), composerStartRestartGroup, StringResource.$stable), onBackClicked, modifier4, IdentiAgreementScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowTopBarProgressIndicator(), false, null, ComposableLambda3.rememberComposableLambda(424915069, true, new C373372(identiAgreementDuxo3, str6, str7, markdownStyleM16260copyR0sFphs$default, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composer2, ((i8 >> 3) & 112) | i6 | ((i8 >> 6) & 896), 48);
                        composerStartRestartGroup = composer2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        identiAgreementDuxo4 = identiAgreementDuxo3;
                        str8 = str6;
                        str9 = str7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        str9 = str4;
                        str8 = str5;
                        identiAgreementDuxo4 = identiAgreementDuxo2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IdentiAgreementScreen4.IdentiAgreementScreen$lambda$3(identiAgreementType, str, onBackClicked, onEvent, modifier4, str9, str8, identiAgreementDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                str5 = str3;
                if ((i & 12582912) != 0) {
                }
                i7 = i3;
                if ((i7 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(identiAgreementDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        eventIdentiAgreementScreen$lambda$1 = IdentiAgreementScreen$lambda$1(FlowExtKt.collectAsStateWithLifecycle(identiAgreementDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                        if (eventIdentiAgreementScreen$lambda$1 != null) {
                            eventConsumerInvoke.consume(eventIdentiAgreementScreen$lambda$1, new Function1() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$IdentiAgreementScreen$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m24774invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m24774invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onEvent.invoke((IdentiAgreementEvent) eventIdentiAgreementScreen$lambda$1.getData());
                                }
                            });
                        }
                        BentoMarkdownText bentoMarkdownText2 = BentoMarkdownText.INSTANCE;
                        int i112 = BentoMarkdownText.$stable;
                        MarkdownStyle markdownStyleM16260copyR0sFphs$default2 = MarkdownStyle.m16260copyR0sFphs$default(bentoMarkdownText2.getStyle(composerStartRestartGroup, i112), null, null, MarkdownStyle.BulletList.copy$default(bentoMarkdownText2.getStyle(composerStartRestartGroup, i112).getBulletList(), (char) 0, (char) 0, (char) 0, "\t\t", 7, null), null, null, null, null, 0L, null, 0, null, 2043, null);
                        Composer composer22 = composerStartRestartGroup;
                        modifier4 = modifier3;
                        AgreementScaffold.AgreementScaffold(StringResource2.getString(IdentiAgreementScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getAgreementTitleRes(), composerStartRestartGroup, StringResource.$stable), onBackClicked, modifier4, IdentiAgreementScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getShowTopBarProgressIndicator(), false, null, ComposableLambda3.rememberComposableLambda(424915069, true, new C373372(identiAgreementDuxo3, str6, str7, markdownStyleM16260copyR0sFphs$default2, snapshotState4CollectAsStateWithLifecycle2), composerStartRestartGroup, 54), composer22, ((i8 >> 3) & 112) | i6 | ((i8 >> 6) & 896), 48);
                        composerStartRestartGroup = composer22;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        identiAgreementDuxo4 = identiAgreementDuxo3;
                        str8 = str6;
                        str9 = str7;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str4 = str2;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            str5 = str3;
            if ((i & 12582912) != 0) {
            }
            i7 = i3;
            if ((i7 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        str5 = str3;
        if ((i & 12582912) != 0) {
        }
        i7 = i3;
        if ((i7 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: IdentiAgreementScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$IdentiAgreementScreen$2 */
    static final class C373372 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ String $buttonDisclosureText;
        final /* synthetic */ IdentiAgreementDuxo $duxo;
        final /* synthetic */ String $overrideButtonText;
        final /* synthetic */ MarkdownStyle $style;
        final /* synthetic */ SnapshotState4<IdentiAgreementViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C373372(IdentiAgreementDuxo identiAgreementDuxo, String str, String str2, MarkdownStyle markdownStyle, SnapshotState4<? extends IdentiAgreementViewState> snapshotState4) {
            this.$duxo = identiAgreementDuxo;
            this.$buttonDisclosureText = str;
            this.$overrideButtonText = str2;
            this.$style = markdownStyle;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(424915069, i2, -1, "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreen.<anonymous> (IdentiAgreementScreen.kt:60)");
            }
            final IdentiAgreementViewState identiAgreementViewStateIdentiAgreementScreen$lambda$0 = IdentiAgreementScreen4.IdentiAgreementScreen$lambda$0(this.$viewState$delegate);
            if (identiAgreementViewStateIdentiAgreementScreen$lambda$0 instanceof IdentiAgreementViewState.Error) {
                composer.startReplaceGroup(1376314000);
                Object obj = this.$duxo;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(obj);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new IdentiAgreementScreen5(obj);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), IdentiAgreementScreen4.AgreementErrorTestTag), (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composer.endReplaceGroup();
            } else if (identiAgreementViewStateIdentiAgreementScreen$lambda$0 instanceof IdentiAgreementViewState.Loaded) {
                composer.startReplaceGroup(1376650133);
                IdentiAgreementViewState.Loaded loaded = (IdentiAgreementViewState.Loaded) identiAgreementViewStateIdentiAgreementScreen$lambda$0;
                String content = loaded.getAgreementWithContent().getContent();
                String string2 = this.$buttonDisclosureText;
                composer.startReplaceGroup(321509115);
                if (string2 == null) {
                    StringResource buttonDisclosureRes = loaded.getButtonDisclosureRes();
                    string2 = buttonDisclosureRes == null ? null : StringResource2.getString(buttonDisclosureRes, composer, StringResource.$stable);
                }
                String str = string2;
                composer.endReplaceGroup();
                boolean submitting = loaded.getSubmitting();
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changedInstance(identiAgreementViewStateIdentiAgreementScreen$lambda$0);
                final IdentiAgreementDuxo identiAgreementDuxo = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$IdentiAgreementScreen$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IdentiAgreementScreen4.C373372.invoke$lambda$2$lambda$1(identiAgreementDuxo, identiAgreementViewStateIdentiAgreementScreen$lambda$0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                MarkdownTextAgreement.MarkdownTextAgreement(content, submitting, (Function0) objRememberedValue2, modifierPadding, null, this.$overrideButtonText, str, this.$style, composer, MarkdownStyle.$stable << 21, 16);
                composer.endReplaceGroup();
            } else {
                if (!(identiAgreementViewStateIdentiAgreementScreen$lambda$0 instanceof IdentiAgreementViewState.Loading)) {
                    composer.startReplaceGroup(321490146);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(321522810);
                IdentiAgreementScreen4.LoadingContent(paddingValues, composer, i2 & 14);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(IdentiAgreementDuxo identiAgreementDuxo, IdentiAgreementViewState identiAgreementViewState) {
            identiAgreementDuxo.onAgreeClicked(((IdentiAgreementViewState.Loaded) identiAgreementViewState).getAgreementWithContent());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdentiAgreementViewState IdentiAgreementScreen$lambda$0(SnapshotState4<? extends IdentiAgreementViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<IdentiAgreementEvent> IdentiAgreementScreen$lambda$1(SnapshotState4<Event<IdentiAgreementEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: IdentiAgreementScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$LoadingContent$1 */
    static final class C373381 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PaddingValues $paddingValues;

        C373381(PaddingValues paddingValues) {
            this.$paddingValues = paddingValues;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469903467, i, -1, "com.robinhood.shared.agreements.agreementsscreen.LoadingContent.<anonymous> (IdentiAgreementScreen.kt:92)");
            }
            String strRepeat = StringsKt.repeat("A ------- ------- --------", 15);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$LoadingContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            MarkdownTextAgreement.MarkdownTextAgreement(strRepeat, true, (Function0) objRememberedValue, PaddingKt.padding(Modifier.INSTANCE, this.$paddingValues), null, null, null, null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingContent(final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1099300357);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1099300357, i2, -1, "com.robinhood.shared.agreements.agreementsscreen.LoadingContent (IdentiAgreementScreen.kt:90)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, AgreementLoadingTestTag), null, ComposableLambda3.rememberComposableLambda(1469903467, true, new C373381(paddingValues), composerStartRestartGroup, 54), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdentiAgreementScreen4.LoadingContent$lambda$4(paddingValues, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2043382634);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2043382634, i, -1, "com.robinhood.shared.agreements.agreementsscreen.PreviewLoadingContent (IdentiAgreementScreen.kt:103)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, IdentiAgreementScreen.INSTANCE.getLambda$1115154398$lib_agreements_screen_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdentiAgreementScreen4.PreviewLoadingContent$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
