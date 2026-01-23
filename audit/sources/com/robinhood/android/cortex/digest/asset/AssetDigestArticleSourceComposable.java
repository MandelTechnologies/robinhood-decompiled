package com.robinhood.android.cortex.digest.asset;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposable;
import com.robinhood.android.cortex.digest.asset.AssetDigestViewState;
import com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposable;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetDigestArticleSourceComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"TAG_COPILOT_DIGEST_ARTICLE_SOURCE_BOTTOM_SHEET", "", "AssetDigestArticleSourceComposable", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "instrumentType", "Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "instrumentId", "Ljava/util/UUID;", "digestId", "source", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;Landroidx/compose/runtime/Composer;I)V", "feature-cortex-digest-asset_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetDigestArticleSourceComposable {
    public static final String TAG_COPILOT_DIGEST_ARTICLE_SOURCE_BOTTOM_SHEET = "copilot_digest_article_source_bottom_sheet";

    /* compiled from: AssetDigestArticleSourceComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType3.values().length];
            try {
                iArr[AssetType3.STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType3.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestArticleSourceComposable$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, AssetType3 assetType3, UUID uuid, String str, AssetDigestViewState.ArticleSourceContent articleSourceContent, int i, Composer composer, int i2) {
        AssetDigestArticleSourceComposable(rhModalBottomSheet5, assetType3, uuid, str, articleSourceContent, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AssetDigestArticleSourceComposable(final RhModalBottomSheet5 rhModalBottomSheet5, final AssetType3 instrumentType, final UUID instrumentId, final String digestId, final AssetDigestViewState.ArticleSourceContent source, Composer composer, final int i) {
        int i2;
        Screen.Name name;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(digestId, "digestId");
        Intrinsics.checkNotNullParameter(source, "source");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1092838247);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(instrumentType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instrumentId) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(digestId) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(source) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1092838247, i2, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposable (AssetDigestArticleSourceComposable.kt:23)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
            if (i3 == 1) {
                name = Screen.Name.CORTEX_SDP_DIGEST_SOURCE_OVERFLOW;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                name = Screen.Name.CORTEX_CDP_DIGEST_SOURCE_OVERFLOW;
            }
            String string2 = instrumentId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, digestId, string2, null, 8, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-331376764, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposableKt.AssetDigestArticleSourceComposable.1

                /* compiled from: AssetDigestArticleSourceComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposableKt$AssetDigestArticleSourceComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AssetDigestViewState.ArticleSourceContent $source;
                    final /* synthetic */ RhModalBottomSheet5 $this_AssetDigestArticleSourceComposable;

                    AnonymousClass1(AssetDigestViewState.ArticleSourceContent articleSourceContent, RhModalBottomSheet5 rhModalBottomSheet5) {
                        this.$source = articleSourceContent;
                        this.$this_AssetDigestArticleSourceComposable = rhModalBottomSheet5;
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
                            ComposerKt.traceEventStart(-1062702567, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposable.<anonymous>.<anonymous> (AssetDigestArticleSourceComposable.kt:37)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(TestTag3.testTag(Modifier.INSTANCE, AssetDigestArticleSourceComposable.TAG_COPILOT_DIGEST_ARTICLE_SOURCE_BOTTOM_SHEET), null, 1, null);
                        ArticleSource articleSource = this.$source.getArticleSource();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.$this_AssetDigestArticleSourceComposable);
                        final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_AssetDigestArticleSourceComposable;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposableKt$AssetDigestArticleSourceComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AssetDigestArticleSourceComposable.C119731.AnonymousClass1.invoke$lambda$1$lambda$0(rhModalBottomSheet5);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        CortexArticleSourceSheetComposable.CortexArticleSourceSheetComposable(articleSource, (Function0) objRememberedValue, modifierLogScreenTransitions$default, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-331376764, i4, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposable.<anonymous> (AssetDigestArticleSourceComposable.kt:36)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1062702567, true, new AnonymousClass1(source, rhModalBottomSheet5), composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestArticleSourceComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestArticleSourceComposable.AssetDigestArticleSourceComposable$lambda$0(rhModalBottomSheet5, instrumentType, instrumentId, digestId, source, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
