package com.robinhood.shared.education.p377ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.bento.util.DefaultScreenMargins;
import com.robinhood.rosetta.converters.engagement.LearningLessons;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lib.education.C39080R;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.HttpUrl;

/* compiled from: EducationSeriesLessonsCarousel.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aP\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u001c\u001a\u00020\u001dX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001dX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u001dX\u0080T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"EducationSeriesLessonsCarousel", "", "lessons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "showNewLabelOnFirstLesson", "", "modifier", "Landroidx/compose/ui/Modifier;", "onLessonCardClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "lessonPreview", "(Lkotlinx/collections/immutable/ImmutableList;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "EducationLessonPreviewCard", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "showNewLabel", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NewInfoTag", "(Landroidx/compose/runtime/Composer;I)V", "CheckmarkIcon", "foregroundColor", "Landroidx/compose/ui/graphics/Color;", "CheckmarkIcon-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)V", "RowTestTag", "", "CheckmarkIconTestTag", "NewInfoTagTestTag", "PreviewCarousel", "lib-education_externalDebug", "backgroundColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EducationSeriesLessonsCarousel5 {
    public static final String CheckmarkIconTestTag = "EducationSeriesLessonsCarouselCheckmarkIcon";
    public static final String NewInfoTagTestTag = "EducationSeriesLessonsCarouselNewInfoTag";
    public static final String RowTestTag = "EducationSeriesLessonsCarouselRow";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckmarkIcon_ek8zF_U$lambda$10(long j, int i, Composer composer, int i2) {
        m25349CheckmarkIconek8zF_U(j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EducationLessonPreviewCard$lambda$8(EducationLessonPreview educationLessonPreview, boolean z, Function0 function0, int i, Composer composer, int i2) {
        EducationLessonPreviewCard(educationLessonPreview, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EducationSeriesLessonsCarousel$lambda$3(ImmutableList immutableList, boolean z, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        EducationSeriesLessonsCarousel(immutableList, z, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewInfoTag$lambda$9(int i, Composer composer, int i2) {
        NewInfoTag(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCarousel$lambda$11(int i, Composer composer, int i2) {
        PreviewCarousel(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EducationSeriesLessonsCarousel(final ImmutableList<EducationLessonPreview> lessons, final boolean z, Modifier modifier, final Function1<? super EducationLessonPreview, Unit> onLessonCardClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        Intrinsics.checkNotNullParameter(onLessonCardClick, "onLessonCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1802030848);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(lessons) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onLessonCardClick) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1802030848, i3, -1, "com.robinhood.shared.education.ui.EducationSeriesLessonsCarousel (EducationSeriesLessonsCarousel.kt:75)");
                }
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(12));
                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, DefaultScreenMargins.INSTANCE.m21612getBottomD9Ej5fM(), 7, null), RowTestTag);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(lessons) | ((i3 & 7168) != 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EducationSeriesLessonsCarousel5.EducationSeriesLessonsCarousel$lambda$2$lambda$1(lessons, z, onLessonCardClick, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyRow(modifierTestTag, lazyListStateRememberLazyListState, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer2, 24576, 488);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EducationSeriesLessonsCarousel5.EducationSeriesLessonsCarousel$lambda$3(lessons, z, modifier3, onLessonCardClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(12));
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = PaddingKt.m5137PaddingValuesYgX7TsA$default(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, DefaultScreenMargins.INSTANCE.m21612getBottomD9Ej5fM(), 7, null), RowTestTag);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(lessons) | ((i3 & 7168) != 2048);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EducationSeriesLessonsCarousel5.EducationSeriesLessonsCarousel$lambda$2$lambda$1(lessons, z, onLessonCardClick, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyRow(modifierTestTag2, lazyListStateRememberLazyListState2, paddingValuesM5137PaddingValuesYgX7TsA$default2, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue, composer2, 24576, 488);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EducationLessonPreviewCard$lambda$5(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EducationLessonPreviewCard$lambda$7(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EducationLessonPreviewCard(final EducationLessonPreview educationLessonPreview, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1610995168);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(educationLessonPreview) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1610995168, i2, -1, "com.robinhood.shared.education.ui.EducationLessonPreviewCard (EducationSeriesLessonsCarousel.kt:113)");
            }
            final boolean isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(isDay);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Color>() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$EducationLessonPreviewCard$foregroundColor$2$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Color invoke() {
                        return Color.m6701boximpl(m25352invoke0d7_KjU());
                    }

                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long m25352invoke0d7_KjU() {
                        return Color2.Color(isDay ? educationLessonPreview.getDayForegroundColor() : educationLessonPreview.getNightForegroundColor());
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(isDay);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Color>() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$EducationLessonPreviewCard$backgroundColor$2$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Color invoke() {
                        return Color.m6701boximpl(m25351invoke0d7_KjU());
                    }

                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long m25351invoke0d7_KjU() {
                        return Color2.Color(isDay ? educationLessonPreview.getDayBackgroundColor() : educationLessonPreview.getNightBackgroundColor());
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            long jEducationLessonPreviewCard$lambda$7 = EducationLessonPreviewCard$lambda$7(snapshotState42);
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function0, 7, null), null, true, false, false, true, false, null, 109, null), false, null, 3, null);
            EducationSeriesLessonsCarousel4 educationSeriesLessonsCarousel4 = EducationSeriesLessonsCarousel4.INSTANCE;
            composer2 = composerStartRestartGroup;
            CardKt.m5548CardFjzlyU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifierWithBentoPlaceholder$default, educationSeriesLessonsCarousel4.m25344getCardWidthD9Ej5fM()), educationSeriesLessonsCarousel4.m25343getCardHeightD9Ej5fM()), null, jEducationLessonPreviewCard$lambda$7, 0L, null, fM7995constructorimpl, ComposableLambda3.rememberComposableLambda(-1323989693, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt.EducationLessonPreviewCard.1
                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1323989693, i3, -1, "com.robinhood.shared.education.ui.EducationLessonPreviewCard.<anonymous> (EducationSeriesLessonsCarousel.kt:138)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    EducationLessonPreview educationLessonPreview2 = educationLessonPreview;
                    boolean z2 = z;
                    SnapshotState4<Color> snapshotState43 = snapshotState4;
                    SnapshotState4<Color> snapshotState44 = snapshotState42;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Horizontal start = arrangement.getStart();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Arrangement.Vertical verticalM5091spacedByD5KLDUw = arrangement.m5091spacedByD5KLDUw(PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.rds_spacing_small, composer3, 0), companion2.getBottom());
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Row5.weight$default(row6, SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.rds_spacing_default, composer3, 0));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(verticalM5091spacedByD5KLDUw, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    if (educationLessonPreview2.isChecked()) {
                        composer3.startReplaceGroup(-152971905);
                        EducationSeriesLessonsCarousel5.m25349CheckmarkIconek8zF_U(EducationSeriesLessonsCarousel5.EducationLessonPreviewCard$lambda$5(snapshotState43), composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (z2) {
                        composer3.startReplaceGroup(-152879215);
                        EducationSeriesLessonsCarousel5.NewInfoTag(composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-152829243);
                        composer3.endReplaceGroup();
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    String title = educationLessonPreview2.getTitle();
                    long jEducationLessonPreviewCard$lambda$5 = EducationSeriesLessonsCarousel5.EducationLessonPreviewCard$lambda$5(snapshotState43);
                    BentoText2.m20747BentoText38GnDrw(title, modifierFillMaxWidth$default2, Color.m6701boximpl(jEducationLessonPreviewCard$lambda$5), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getDisplayCapsuleMedium(), composer3, 48, 0, 8120);
                    composer3.endNode();
                    boolean zBooleanValue = ((Boolean) composer3.consume(InspectionMode.getLocalInspectionMode())).booleanValue();
                    ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.01d, null, composer3, 6, 2);
                    HttpUrl previewPeekedImageUrl = educationLessonPreview2.getPreviewPeekedImageUrl();
                    if (previewPeekedImageUrl == null) {
                        previewPeekedImageUrl = educationLessonPreview2.getPreviewLargeImageUrl();
                    }
                    AsyncImagePainter asyncImagePainterM9105rememberAsyncImagePainter0YpotYA = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(previewPeekedImageUrl, imageLoaderRememberImageLoader, null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                    Alignment centerStart = companion2.getCenterStart();
                    String strStringResource = StringResources_androidKt.stringResource(C39080R.string.education_lesson_preview_thumbnail_image_content_description, composer3, 0);
                    Modifier modifierM4872backgroundbw27NRU$default = companion;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(modifierM4872backgroundbw27NRU$default, EducationSeriesLessonsCarousel4.INSTANCE.m25345getImageWidthD9Ej5fM()), 0.0f, 1, null);
                    if (zBooleanValue) {
                        modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM4872backgroundbw27NRU$default, EducationSeriesLessonsCarousel5.EducationLessonPreviewCard$lambda$7(snapshotState44), null, 2, null);
                    }
                    ImageKt.Image(asyncImagePainterM9105rememberAsyncImagePainter0YpotYA, strStringResource, modifierFillMaxHeight$default.then(modifierM4872backgroundbw27NRU$default), centerStart, fillWidth, 0.0f, (ColorFilter) null, composer3, 27648, 96);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, 1769472, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationSeriesLessonsCarousel5.EducationLessonPreviewCard$lambda$8(educationLessonPreview, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewInfoTag(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1726807612);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1726807612, i, -1, "com.robinhood.shared.education.ui.NewInfoTag (EducationSeriesLessonsCarousel.kt:183)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C39080R.string.education_lesson_preview_info_tag_new, composerStartRestartGroup, 0);
            int resourceId = ServerToBentoAssetMapper2.STAR_FILLED_16.getResourceId();
            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(strStringResource, TestTag3.testTag(Modifier.INSTANCE, NewInfoTagTestTag), Integer.valueOf(resourceId), null, StringResources_androidKt.stringResource(C39080R.string.education_lesson_preview_info_tag_content_description, composerStartRestartGroup, 0), false, null, null, composerStartRestartGroup, 12582960, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationSeriesLessonsCarousel5.NewInfoTag$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckmarkIcon-ek8zF_U, reason: not valid java name */
    public static final void m25349CheckmarkIconek8zF_U(final long j, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1002828585);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1002828585, i2, -1, "com.robinhood.shared.education.ui.CheckmarkIcon (EducationSeriesLessonsCarousel.kt:194)");
            }
            IconKt.m5602Iconww6aTOc(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_checkmark_16dp, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C39080R.string.education_lesson_preview_checkmark_content_description, composerStartRestartGroup, 0), TestTag3.testTag(Modifier.INSTANCE, CheckmarkIconTestTag), Color.m6705copywmQWz5c$default(j, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationSeriesLessonsCarousel5.CheckmarkIcon_ek8zF_U$lambda$10(j, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EducationSeriesLessonsCarousel$lambda$2$lambda$1(final ImmutableList immutableList, final boolean z, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$EducationSeriesLessonsCarousel$lambda$2$lambda$1$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                immutableList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$EducationSeriesLessonsCarousel$lambda$2$lambda$1$$inlined$itemsIndexed$default$3
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final EducationLessonPreview educationLessonPreview = (EducationLessonPreview) immutableList.get(i);
                composer.startReplaceGroup(-763588979);
                final boolean z2 = z && i == 0 && educationLessonPreview.getShowNewLabel();
                UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_LEARNING_LESSON;
                Component component = new Component(Component.ComponentType.LEARNING_LESSON_CARD, null, null, 6, null);
                Context eventContext = AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composer, AutoLoggingCompositionLocals3.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, action, Context.copy$default(eventContext == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : eventContext, i + 1, immutableList.size(), 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LearningLessons.toProtobuf(educationLessonPreview, false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108868, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
                final Function1 function12 = function1;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(429272792, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$EducationSeriesLessonsCarousel$1$1$1$1
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
                            ComposerKt.traceEventStart(429272792, i4, -1, "com.robinhood.shared.education.ui.EducationSeriesLessonsCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EducationSeriesLessonsCarousel.kt:98)");
                        }
                        EducationLessonPreview educationLessonPreview2 = educationLessonPreview;
                        boolean z3 = z2;
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(function12) | composer2.changedInstance(educationLessonPreview);
                        final Function1<EducationLessonPreview, Unit> function13 = function12;
                        final EducationLessonPreview educationLessonPreview3 = educationLessonPreview;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$EducationSeriesLessonsCarousel$1$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function13.invoke(educationLessonPreview3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EducationSeriesLessonsCarousel5.EducationLessonPreviewCard(educationLessonPreview2, z3, (Function0) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 48);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final void PreviewCarousel(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(947420);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947420, i, -1, "com.robinhood.shared.education.ui.PreviewCarousel (EducationSeriesLessonsCarousel.kt:216)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), EducationSeriesLessonsCarousel.INSTANCE.getLambda$1295923228$lib_education_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationSeriesLessonsCarousel5.PreviewCarousel$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
