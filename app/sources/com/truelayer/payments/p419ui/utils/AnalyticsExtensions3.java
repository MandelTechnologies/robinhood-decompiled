package com.truelayer.payments.p419ui.utils;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import com.truelayer.payments.analytics.utils.AnalyticsError;
import com.truelayer.payments.analytics.utils.ErrorType;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.theme.Color7;
import com.truelayer.payments.p419ui.theme.Shape2;
import com.truelayer.payments.p419ui.theme.Typography6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsExtensions.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0006H\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\nH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\f*\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000\u001a \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a;\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0011*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001a\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0011*\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0019H\u0002\u001a\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0011*\u00020\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u0017H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m3636d2 = {"getColorAnalyticsKey", "", "name", "getShapeAnalyticsKey", "getTypographyAnalyticsKey", "toAnalytics", "Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Color;", "toAnalytics-8_81llA", "(J)Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "toAnalyticsError", "Lcom/truelayer/payments/analytics/utils/AnalyticsError;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "toAnalyticsMap", "", "Landroidx/compose/material3/ColorScheme;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Landroidx/compose/material3/MaterialTheme;", "defaultColors", "defaultTypography", "Landroidx/compose/material3/Typography;", "defaultShapes", "Landroidx/compose/material3/Shapes;", "(Landroidx/compose/material3/MaterialTheme;Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Typography;Landroidx/compose/material3/Shapes;Landroidx/compose/runtime/Composer;II)Ljava/util/Map;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.utils.AnalyticsExtensionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AnalyticsExtensions3 {

    /* compiled from: AnalyticsExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.utils.AnalyticsExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoreError.HttpError.ServerErrorType.values().length];
            try {
                iArr[CoreError.HttpError.ServerErrorType.ProviderError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoreError.HttpError.ServerErrorType.InvalidState.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoreError.HttpError.ServerErrorType.InvalidParameters.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoreError.HttpError.ServerErrorType.Unauthenticated.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CoreError.HttpError.ServerErrorType.Forbidden.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CoreError.HttpError.ServerErrorType.NotFound.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CoreError.HttpError.ServerErrorType.IdempotencyKeyConcurrencyConflict.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CoreError.HttpError.ServerErrorType.IdempotencyKeyReuse.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CoreError.HttpError.ServerErrorType.UnknownError.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ AnalyticsError toAnalyticsError$default(CoreError coreError, PaymentContext paymentContext, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentContext = null;
        }
        return toAnalyticsError(coreError, paymentContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AnalyticsError toAnalyticsError(CoreError coreError, PaymentContext paymentContext) {
        ErrorType errorType;
        String message;
        ErrorType errorType2;
        Intrinsics.checkNotNullParameter(coreError, "<this>");
        int autoRetry = 0;
        if (coreError instanceof CoreError.ConnectionError) {
            errorType = ErrorType.Connection;
        } else if (coreError instanceof CoreError.CertificateValidationError) {
            errorType = ErrorType.CertificateValidation;
        } else if (coreError instanceof CoreError.HttpError.InvalidParameters) {
            if (((CoreError.HttpError.InvalidParameters) coreError).getInvalidParameters().keySet().contains("redirect.return_uri")) {
                if (paymentContext != null) {
                    message = "Missing return_uri from setting: " + paymentContext.getRedirectUri();
                } else {
                    message = null;
                }
                errorType2 = ErrorType.MissingReturnUri;
                int i = autoRetry;
                if (message == null) {
                    message = coreError.getMessage();
                }
                String str = message;
                String responseBody = coreError.getResponseBody();
                Throwable cause = coreError.getCause();
                return new AnalyticsError(errorType2, str, true, responseBody, coreError.getTraceId(), cause != null ? cause.toString() : null, i, coreError.getEndpoint(), coreError.getUnderlyingError());
            }
            errorType = ErrorType.InvalidParameters;
        } else if (coreError instanceof CoreError.HttpError.ServerError) {
            CoreError.HttpError.ServerError serverError = (CoreError.HttpError.ServerError) coreError;
            autoRetry = serverError.getAutoRetry();
            switch (WhenMappings.$EnumSwitchMapping$0[serverError.getType().ordinal()]) {
                case 1:
                    errorType = ErrorType.Provider;
                    break;
                case 2:
                    errorType = ErrorType.InvalidState;
                    break;
                case 3:
                    errorType = ErrorType.InvalidParameters;
                    break;
                case 4:
                    errorType = ErrorType.Authentication;
                    break;
                case 5:
                    errorType = ErrorType.Forbidden;
                    break;
                case 6:
                    errorType = ErrorType.NotFound;
                    break;
                case 7:
                    errorType = ErrorType.IdempotencyKeyConcurrencyConflict;
                    break;
                case 8:
                    errorType = ErrorType.IdempotencyKeyReuse;
                    break;
                case 9:
                    errorType = ErrorType.Server;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(coreError instanceof CoreError.ValidationError)) {
                throw new NoWhenBranchMatchedException();
            }
            errorType = ErrorType.Validation;
        }
        errorType2 = errorType;
        message = null;
        int i2 = autoRetry;
        if (message == null) {
        }
        String str2 = message;
        String responseBody2 = coreError.getResponseBody();
        Throwable cause2 = coreError.getCause();
        if (cause2 != null) {
        }
        return new AnalyticsError(errorType2, str2, true, responseBody2, coreError.getTraceId(), cause2 != null ? cause2.toString() : null, i2, coreError.getEndpoint(), coreError.getUnderlyingError());
    }

    public static final Map<String, String> toAnalyticsMap(MaterialTheme materialTheme, ColorScheme colorScheme, Typography typography, Shapes shapes, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(materialTheme, "<this>");
        composer.startReplaceableGroup(790921856);
        if ((i2 & 1) != 0) {
            colorScheme = Color7.getLightColorDefaults();
        }
        if ((i2 & 2) != 0) {
            typography = Typography6.getTypographyDefaults();
        }
        if ((i2 & 4) != 0) {
            shapes = Shape2.getShapeDefaults();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(790921856, i, -1, "com.truelayer.payments.ui.utils.toAnalyticsMap (AnalyticsExtensions.kt:71)");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = MaterialTheme.$stable;
        int i4 = i & 14;
        linkedHashMap.putAll(toAnalyticsMap(materialTheme.getColorScheme(composer, i3 | i4), colorScheme));
        linkedHashMap.putAll(toAnalyticsMap(materialTheme.getTypography(composer, i3 | i4), typography));
        linkedHashMap.putAll(toAnalyticsMap(materialTheme.getShapes(composer, i3 | i4), shapes));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return linkedHashMap;
    }

    private static final Map<String, String> toAnalyticsMap(ColorScheme colorScheme, ColorScheme colorScheme2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!Color.m6707equalsimpl0(colorScheme.getPrimary(), colorScheme2.getPrimary())) {
            linkedHashMap.put(getColorAnalyticsKey(InstantRetirementSplashScreen.PrimaryButtonTag), m27182toAnalytics8_81llA(colorScheme.getPrimary()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnPrimary(), colorScheme2.getOnPrimary())) {
            linkedHashMap.put(getColorAnalyticsKey("onPrimary"), m27182toAnalytics8_81llA(colorScheme.getOnPrimary()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getPrimaryContainer(), colorScheme2.getPrimaryContainer())) {
            linkedHashMap.put(getColorAnalyticsKey("primaryContainer"), m27182toAnalytics8_81llA(colorScheme.getPrimaryContainer()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnPrimaryContainer(), colorScheme2.getOnPrimaryContainer())) {
            linkedHashMap.put(getColorAnalyticsKey("onPrimaryContainer"), m27182toAnalytics8_81llA(colorScheme.getOnPrimaryContainer()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getInversePrimary(), colorScheme2.getInversePrimary())) {
            linkedHashMap.put(getColorAnalyticsKey("inversePrimary"), m27182toAnalytics8_81llA(colorScheme.getInversePrimary()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getSecondary(), colorScheme2.getSecondary())) {
            linkedHashMap.put(getColorAnalyticsKey(InstantRetirementSplashScreen.SecondaryButtonTag), m27182toAnalytics8_81llA(colorScheme.getSecondary()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnSecondary(), colorScheme2.getOnSecondary())) {
            linkedHashMap.put(getColorAnalyticsKey("onSecondary"), m27182toAnalytics8_81llA(colorScheme.getOnSecondary()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getSecondaryContainer(), colorScheme2.getSecondaryContainer())) {
            linkedHashMap.put(getColorAnalyticsKey("secondaryContainer"), m27182toAnalytics8_81llA(colorScheme.getSecondaryContainer()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnSecondaryContainer(), colorScheme2.getOnSecondaryContainer())) {
            linkedHashMap.put(getColorAnalyticsKey("onSecondaryContainer"), m27182toAnalytics8_81llA(colorScheme.getOnSecondaryContainer()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getTertiary(), colorScheme2.getTertiary())) {
            linkedHashMap.put(getColorAnalyticsKey("tertiary"), m27182toAnalytics8_81llA(colorScheme.getTertiary()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnTertiary(), colorScheme2.getOnTertiary())) {
            linkedHashMap.put(getColorAnalyticsKey("onTertiary"), m27182toAnalytics8_81llA(colorScheme.getOnTertiary()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getTertiaryContainer(), colorScheme2.getTertiaryContainer())) {
            linkedHashMap.put(getColorAnalyticsKey("tertiaryContainer"), m27182toAnalytics8_81llA(colorScheme.getTertiaryContainer()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnTertiaryContainer(), colorScheme2.getOnTertiaryContainer())) {
            linkedHashMap.put(getColorAnalyticsKey("onTertiaryContainer"), m27182toAnalytics8_81llA(colorScheme.getOnTertiaryContainer()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getBackground(), colorScheme2.getBackground())) {
            linkedHashMap.put(getColorAnalyticsKey("background"), m27182toAnalytics8_81llA(colorScheme.getBackground()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnBackground(), colorScheme2.getOnBackground())) {
            linkedHashMap.put(getColorAnalyticsKey("onBackground"), m27182toAnalytics8_81llA(colorScheme.getOnBackground()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getSurface(), colorScheme2.getSurface())) {
            linkedHashMap.put(getColorAnalyticsKey("surface"), m27182toAnalytics8_81llA(colorScheme.getSurface()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnSurface(), colorScheme2.getOnSurface())) {
            linkedHashMap.put(getColorAnalyticsKey("onSurface"), m27182toAnalytics8_81llA(colorScheme.getOnSurface()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getSurfaceVariant(), colorScheme2.getSurfaceVariant())) {
            linkedHashMap.put(getColorAnalyticsKey("surfaceVariant"), m27182toAnalytics8_81llA(colorScheme.getSurfaceVariant()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnSurfaceVariant(), colorScheme2.getOnSurfaceVariant())) {
            linkedHashMap.put(getColorAnalyticsKey("onSurfaceVariant"), m27182toAnalytics8_81llA(colorScheme.getOnSurfaceVariant()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getSurfaceTint(), colorScheme2.getSurfaceTint())) {
            linkedHashMap.put(getColorAnalyticsKey("surfaceTint"), m27182toAnalytics8_81llA(colorScheme.getSurfaceTint()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getInverseSurface(), colorScheme2.getInverseSurface())) {
            linkedHashMap.put(getColorAnalyticsKey("inverseSurface"), m27182toAnalytics8_81llA(colorScheme.getInverseSurface()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getInverseOnSurface(), colorScheme2.getInverseOnSurface())) {
            linkedHashMap.put(getColorAnalyticsKey("inverseOnSurface"), m27182toAnalytics8_81llA(colorScheme.getInverseOnSurface()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getError(), colorScheme2.getError())) {
            linkedHashMap.put(getColorAnalyticsKey("error"), m27182toAnalytics8_81llA(colorScheme.getError()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnError(), colorScheme2.getOnError())) {
            linkedHashMap.put(getColorAnalyticsKey("onError"), m27182toAnalytics8_81llA(colorScheme.getOnError()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getErrorContainer(), colorScheme2.getErrorContainer())) {
            linkedHashMap.put(getColorAnalyticsKey("errorContainer"), m27182toAnalytics8_81llA(colorScheme.getErrorContainer()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOnErrorContainer(), colorScheme2.getOnErrorContainer())) {
            linkedHashMap.put(getColorAnalyticsKey("onErrorContainer"), m27182toAnalytics8_81llA(colorScheme.getOnErrorContainer()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOutline(), colorScheme2.getOutline())) {
            linkedHashMap.put(getColorAnalyticsKey("outline"), m27182toAnalytics8_81llA(colorScheme.getOutline()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getOutlineVariant(), colorScheme2.getOutlineVariant())) {
            linkedHashMap.put(getColorAnalyticsKey("outlineVariant"), m27182toAnalytics8_81llA(colorScheme.getOutlineVariant()));
        }
        if (!Color.m6707equalsimpl0(colorScheme.getScrim(), colorScheme2.getScrim())) {
            linkedHashMap.put(getColorAnalyticsKey("scrim"), m27182toAnalytics8_81llA(colorScheme.getScrim()));
        }
        return linkedHashMap;
    }

    static /* synthetic */ Map toAnalyticsMap$default(Typography typography, Typography typography2, int i, Object obj) {
        if ((i & 1) != 0) {
            typography2 = Typography6.getTypographyDefaults();
        }
        return toAnalyticsMap(typography, typography2);
    }

    private static final Map<String, String> toAnalyticsMap(Typography typography, Typography typography2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!Intrinsics.areEqual(typography.getDisplayLarge(), typography2.getDisplayLarge())) {
            linkedHashMap.put(getTypographyAnalyticsKey("displayLarge"), toAnalytics(typography.getDisplayLarge()));
        }
        if (!Intrinsics.areEqual(typography.getDisplayMedium(), typography2.getDisplayMedium())) {
            linkedHashMap.put(getTypographyAnalyticsKey("displayMedium"), toAnalytics(typography.getDisplayMedium()));
        }
        if (!Intrinsics.areEqual(typography.getDisplaySmall(), typography2.getDisplaySmall())) {
            linkedHashMap.put(getTypographyAnalyticsKey("displaySmall"), toAnalytics(typography.getDisplaySmall()));
        }
        if (!Intrinsics.areEqual(typography.getHeadlineLarge(), typography2.getHeadlineLarge())) {
            linkedHashMap.put(getTypographyAnalyticsKey("headlineLarge"), toAnalytics(typography.getHeadlineLarge()));
        }
        if (!Intrinsics.areEqual(typography.getHeadlineMedium(), typography2.getHeadlineMedium())) {
            linkedHashMap.put(getTypographyAnalyticsKey("headlineMedium"), toAnalytics(typography.getHeadlineMedium()));
        }
        if (!Intrinsics.areEqual(typography.getHeadlineSmall(), typography2.getHeadlineSmall())) {
            linkedHashMap.put(getTypographyAnalyticsKey("headlineSmall"), toAnalytics(typography.getHeadlineSmall()));
        }
        if (!Intrinsics.areEqual(typography.getTitleLarge(), typography2.getTitleLarge())) {
            linkedHashMap.put(getTypographyAnalyticsKey("titleLarge"), toAnalytics(typography.getTitleLarge()));
        }
        if (!Intrinsics.areEqual(typography.getTitleMedium(), typography2.getTitleMedium())) {
            linkedHashMap.put(getTypographyAnalyticsKey("titleMedium"), toAnalytics(typography.getTitleMedium()));
        }
        if (!Intrinsics.areEqual(typography.getTitleSmall(), typography2.getTitleSmall())) {
            linkedHashMap.put(getTypographyAnalyticsKey("titleSmall"), toAnalytics(typography.getTitleSmall()));
        }
        if (!Intrinsics.areEqual(typography.getBodyLarge(), typography2.getBodyLarge())) {
            linkedHashMap.put(getTypographyAnalyticsKey("bodyLarge"), toAnalytics(typography.getBodyLarge()));
        }
        if (!Intrinsics.areEqual(typography.getBodyMedium(), typography2.getBodyMedium())) {
            linkedHashMap.put(getTypographyAnalyticsKey("bodyMedium"), toAnalytics(typography.getBodyMedium()));
        }
        if (!Intrinsics.areEqual(typography.getBodySmall(), typography2.getBodySmall())) {
            linkedHashMap.put(getTypographyAnalyticsKey("bodySmall"), toAnalytics(typography.getBodySmall()));
        }
        if (!Intrinsics.areEqual(typography.getLabelLarge(), typography2.getLabelLarge())) {
            linkedHashMap.put(getTypographyAnalyticsKey("labelLarge"), toAnalytics(typography.getLabelLarge()));
        }
        if (!Intrinsics.areEqual(typography.getLabelMedium(), typography2.getLabelMedium())) {
            linkedHashMap.put(getTypographyAnalyticsKey("labelMedium"), toAnalytics(typography.getLabelMedium()));
        }
        if (!Intrinsics.areEqual(typography.getLabelSmall(), typography2.getLabelSmall())) {
            linkedHashMap.put(getTypographyAnalyticsKey("labelSmall"), toAnalytics(typography.getLabelSmall()));
        }
        return linkedHashMap;
    }

    static /* synthetic */ Map toAnalyticsMap$default(Shapes shapes, Shapes shapes2, int i, Object obj) {
        if ((i & 1) != 0) {
            shapes2 = Shape2.getShapeDefaults();
        }
        return toAnalyticsMap(shapes, shapes2);
    }

    private static final Map<String, String> toAnalyticsMap(Shapes shapes, Shapes shapes2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!Intrinsics.areEqual(shapes.getExtraSmall(), shapes2.getExtraSmall())) {
            linkedHashMap.put(getShapeAnalyticsKey("extraSmall"), toAnalytics(shapes.getExtraSmall()));
        }
        if (!Intrinsics.areEqual(shapes.getExtraLarge(), shapes2.getExtraLarge())) {
            linkedHashMap.put(getShapeAnalyticsKey("extraLarge"), toAnalytics(shapes.getExtraLarge()));
        }
        if (!Intrinsics.areEqual(shapes.getSmall(), shapes2.getSmall())) {
            linkedHashMap.put(getShapeAnalyticsKey("small"), toAnalytics(shapes.getSmall()));
        }
        if (!Intrinsics.areEqual(shapes.getMedium(), shapes2.getMedium())) {
            linkedHashMap.put(getShapeAnalyticsKey("medium"), toAnalytics(shapes.getMedium()));
        }
        if (!Intrinsics.areEqual(shapes.getLarge(), shapes2.getLarge())) {
            linkedHashMap.put(getShapeAnalyticsKey("large"), toAnalytics(shapes.getLarge()));
        }
        return linkedHashMap;
    }

    private static final String getColorAnalyticsKey(String str) {
        return "color." + str;
    }

    private static final String getTypographyAnalyticsKey(String str) {
        return "typography." + str;
    }

    private static final String getShapeAnalyticsKey(String str) {
        return "shape." + str;
    }

    /* renamed from: toAnalytics-8_81llA, reason: not valid java name */
    private static final String m27182toAnalytics8_81llA(long j) {
        return String.valueOf(Color2.m6735toArgb8_81llA(j));
    }

    private static final String toAnalytics(TextStyle textStyle) {
        return String.valueOf(textStyle.getFontFamily());
    }

    private static final String toAnalytics(CornerBasedShape cornerBasedShape) {
        return cornerBasedShape.getTopStart() + "," + cornerBasedShape.getTopEnd() + "," + cornerBasedShape.getBottomStart() + "," + cornerBasedShape.getBottomEnd();
    }
}
