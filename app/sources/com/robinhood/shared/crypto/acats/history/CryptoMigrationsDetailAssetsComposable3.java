package com.robinhood.shared.crypto.acats.history;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailAssetsResponseDto;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRow2;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposable3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import rh_server_driven_ui.p531v1.MetaElementDto;
import rh_server_driven_ui.p531v1.NavigationRowDto;
import rh_server_driven_ui.p531v1.PlainTextDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TextElementDto;

/* compiled from: CryptoMigrationsDetailAssetsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"CryptoMigrationsDetailAssetsComposable", "", "dto", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewCryptoMigrationsDetailAssetsComposable", "(Landroidx/compose/runtime/Composer;I)V", "feature-acats_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoMigrationsDetailAssetsComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoMigrationsDetailAssetsComposable$lambda$0(CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoMigrationsDetailAssetsComposable(cryptoMigrationsDetailAssetsResponseDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCryptoMigrationsDetailAssetsComposable$lambda$1(int i, Composer composer, int i2) {
        PreviewCryptoMigrationsDetailAssetsComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoMigrationsDetailAssetsComposable(final CryptoMigrationsDetailAssetsResponseDto dto, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1300904808);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(dto) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1300904808, i3, -1, "com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposable (CryptoMigrationsDetailAssetsComposable.kt:37)");
            }
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TXN_DETAIL, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1573896643, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt.CryptoMigrationsDetailAssetsComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573896643, i5, -1, "com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposable.<anonymous> (CryptoMigrationsDetailAssetsComposable.kt:43)");
                    }
                    Boolean bool = Boolean.FALSE;
                    final Modifier modifier2 = modifier;
                    final CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto = dto;
                    GenericActionHandlerKt.GenericActionHandler(bool, true, null, null, ComposableLambda3.rememberComposableLambda(-504394667, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt.CryptoMigrationsDetailAssetsComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-504394667, i6, -1, "com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposable.<anonymous>.<anonymous> (CryptoMigrationsDetailAssetsComposable.kt:47)");
                            }
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier2, null, 1, null);
                            final CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto2 = cryptoMigrationsDetailAssetsResponseDto;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, ComposableLambda3.rememberComposableLambda(817504273, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt.CryptoMigrationsDetailAssetsComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(817504273, i7, -1, "com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposable.<anonymous>.<anonymous>.<anonymous> (CryptoMigrationsDetailAssetsComposable.kt:50)");
                                    }
                                    AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                    final CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto3 = cryptoMigrationsDetailAssetsResponseDto2;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(884541508, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt.CryptoMigrationsDetailAssetsComposable.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i8) {
                                            if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(884541508, i8, -1, "com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoMigrationsDetailAssetsComposable.kt:60)");
                                            }
                                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                            CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto4 = cryptoMigrationsDetailAssetsResponseDto3;
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer5, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, companion);
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            BentoText2.m20747BentoText38GnDrw(cryptoMigrationsDetailAssetsResponseDto4.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16382);
                                            String subtitle = cryptoMigrationsDetailAssetsResponseDto4.getSubtitle();
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i9 = BentoTheme.$stable;
                                            BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(bentoTheme.getColors(composer5, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i9).getTextS(), composer5, 0, 0, 8186);
                                            composer5.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), null, CryptoMigrationsDetailAssetsComposable.INSTANCE.m24878getLambda$1447457424$feature_acats_externalRelease(), null, null, false, false, appBarType, null, 0L, null, composer4, 12583302, 0, 1914);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(2071279270, true, new AnonymousClass2(cryptoMigrationsDetailAssetsResponseDto), composer3, 54), composer3, 805306416, 508);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoMigrationsDetailAssetsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt$CryptoMigrationsDetailAssetsComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ CryptoMigrationsDetailAssetsResponseDto $dto;

                            AnonymousClass2(CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto) {
                                this.$dto = cryptoMigrationsDetailAssetsResponseDto;
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
                                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2071279270, i2, -1, "com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposable.<anonymous>.<anonymous>.<anonymous> (CryptoMigrationsDetailAssetsComposable.kt:72)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$dto);
                                final CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto = this.$dto;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt$CryptoMigrationsDetailAssetsComposable$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoMigrationsDetailAssetsComposable3.C375581.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(cryptoMigrationsDetailAssetsResponseDto, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifierPadding, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 506);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final List<NavigationRowDto> assets = cryptoMigrationsDetailAssetsResponseDto.getAssets();
                                final C37554xe976dd39 c37554xe976dd39 = new Function1() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt$CryptoMigrationsDetailAssetsComposable$1$1$2$invoke$lambda$3$lambda$2$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(NavigationRowDto navigationRowDto) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((NavigationRowDto) obj);
                                    }
                                };
                                LazyColumn.items(assets.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt$CryptoMigrationsDetailAssetsComposable$1$1$2$invoke$lambda$3$lambda$2$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c37554xe976dd39.invoke(assets.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt$CryptoMigrationsDetailAssetsComposable$1$1$2$invoke$lambda$3$lambda$2$$inlined$items$default$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                        int i3;
                                        if ((i2 & 6) == 0) {
                                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                        } else {
                                            i3 = i2;
                                        }
                                        if ((i2 & 48) == 0) {
                                            i3 |= composer.changed(i) ? 32 : 16;
                                        }
                                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                        }
                                        NavigationRowDto navigationRowDto = (NavigationRowDto) assets.get(i);
                                        composer.startReplaceGroup(1309786351);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = CryptoMigrationsDetailAssetsComposable4.INSTANCE;
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        SduiNavigationRow2.SduiNavigationRow(navigationRowDto, (Function1) ((KFunction) objRememberedValue), null, null, composer, 48, 12);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 24630, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoMigrationsDetailAssetsComposable3.CryptoMigrationsDetailAssetsComposable$lambda$0(dto, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewCryptoMigrationsDetailAssetsComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-40435091);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-40435091, i, -1, "com.robinhood.shared.crypto.acats.history.PreviewCryptoMigrationsDetailAssetsComposable (CryptoMigrationsDetailAssetsComposable.kt:94)");
            }
            CryptoMigrationsDetailAssetsComposable(new CryptoMigrationsDetailAssetsResponseDto("test-id", "Account transfer", "From Bitstamp", CollectionsKt.listOf((Object[]) new NavigationRowDto[]{new NavigationRowDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("USD"))), new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("Cash"))), null, false, null, null, new MetaElementDto(new MetaElementDto.ConcreteDto.Text(new TextElementDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("$1,000.00")))))), 60, null), new NavigationRowDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("Bitcoin"))), new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO))), null, false, null, null, new MetaElementDto(new MetaElementDto.ConcreteDto.Text(new TextElementDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("0.12345678 BTC")))))), 60, null), new NavigationRowDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("Ethereum"))), new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("ETH"))), null, false, null, null, new MetaElementDto(new MetaElementDto.ConcreteDto.Text(new TextElementDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("0.12345678 ETH")))))), 60, null), new NavigationRowDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("Solana"))), new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("SOL"))), null, false, null, null, new MetaElementDto(new MetaElementDto.ConcreteDto.Text(new TextElementDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("0.12345678 SOL")))))), 60, null)})), null, composerStartRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoMigrationsDetailAssetsComposable3.PreviewCryptoMigrationsDetailAssetsComposable$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
