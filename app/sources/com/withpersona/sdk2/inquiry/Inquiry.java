package com.withpersona.sdk2.inquiry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.BundleCompat;
import androidx.view.result.contract.ActivityResultContract;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.InquiryResponse;
import com.withpersona.sdk2.inquiry.error_reporting.ExceptionLogger;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldsMap;
import com.withpersona.sdk2.inquiry.internal.InquiryIntentKeys;
import com.withpersona.sdk2.inquiry.internal.Prefetching;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Inquiry.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u0002/0BÇ\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\rH\u0007J\b\u0010%\u001a\u00020&H\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0015\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u00061"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry;", "", "templateId", "", "templateVersion", "inquiryId", "sessionToken", "oneTimeLinkCode", "referenceId", "accountId", "fields", "Lcom/withpersona/sdk2/inquiry/Fields;", "theme", "", "environment", "Lcom/withpersona/sdk2/inquiry/Environment;", "environmentId", "enableErrorLogging", "", "returnCollectedData", "fallbackMode", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "useServerStyles", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "themeSetId", "locale", "consumeExceptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/Fields;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/Environment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/FallbackMode;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "Ljava/lang/Boolean;", "start", "", "activity", "Landroid/app/Activity;", "requestCode", "buildInlineInquiry", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "toInquiryActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "addArgumentsToBundle", "bundle", "Landroid/os/Bundle;", "addArgumentsToBundle$inquiry_dynamic_feature_release", "Contract", "Companion", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class Inquiry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountId;
    private final Boolean consumeExceptions;
    private final Boolean enableErrorLogging;
    private final Environment environment;
    private final String environmentId;
    private final FallbackMode fallbackMode;
    private final Fields fields;
    private final String inquiryId;
    private final String locale;
    private final String oneTimeLinkCode;
    private final String referenceId;
    private final Boolean returnCollectedData;
    private final String sessionToken;
    private final StaticInquiryTemplate staticInquiryTemplate;
    private final String templateId;
    private final String templateVersion;
    private final Integer theme;
    private final String themeSetId;
    private final Boolean useServerStyles;

    @JvmStatic
    public static final InquiryResponse extractInquiryResponseFromBundle(Bundle bundle, Context context) {
        return INSTANCE.extractInquiryResponseFromBundle(bundle, context);
    }

    @JvmStatic
    public static final InquiryBuilder fromInquiry(String str) {
        return INSTANCE.fromInquiry(str);
    }

    @JvmStatic
    public static final InquiryBuilder fromOneTimeLinkCode(String str) {
        return INSTANCE.fromOneTimeLinkCode(str);
    }

    @JvmStatic
    @ExperimentalInquiryFlow
    public static final InquiryTemplateBuilder fromStaticTemplate(StaticInquiryTemplate staticInquiryTemplate) {
        return INSTANCE.fromStaticTemplate(staticInquiryTemplate);
    }

    @JvmStatic
    public static final InquiryTemplateBuilder fromTemplate(String str) {
        return INSTANCE.fromTemplate(str);
    }

    @JvmStatic
    public static final InquiryTemplateBuilder fromTemplateVersion(String str) {
        return INSTANCE.fromTemplateVersion(str);
    }

    @Deprecated
    @JvmStatic
    @JvmOverloads
    public static final InquiryResponse onActivityResult(Intent intent) {
        return INSTANCE.onActivityResult(intent);
    }

    @Deprecated
    @JvmStatic
    @JvmOverloads
    public static final InquiryResponse onActivityResult(Intent intent, Context context) {
        return INSTANCE.onActivityResult(intent, context);
    }

    public Inquiry(String str, String str2, String str3, String str4, String str5, String str6, String str7, Fields fields, Integer num, Environment environment, String str8, Boolean bool, Boolean bool2, FallbackMode fallbackMode, Boolean bool3, StaticInquiryTemplate staticInquiryTemplate, String str9, String str10, Boolean bool4) {
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.oneTimeLinkCode = str5;
        this.referenceId = str6;
        this.accountId = str7;
        this.fields = fields;
        this.theme = num;
        this.environment = environment;
        this.environmentId = str8;
        this.enableErrorLogging = bool;
        this.returnCollectedData = bool2;
        this.fallbackMode = fallbackMode;
        this.useServerStyles = bool3;
        this.staticInquiryTemplate = staticInquiryTemplate;
        this.themeSetId = str9;
        this.locale = str10;
        this.consumeExceptions = bool4;
    }

    @Deprecated
    public final void start(Activity activity, int requestCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityForResult(toInquiryActivityIntent(activity), requestCode);
    }

    @ExperimentalInlineApi
    public final InlineInquiryBuilder buildInlineInquiry() {
        return new InlineInquiryBuilder(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent toInquiryActivityIntent(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.withpersona.sdk2.inquiry.internal.InquiryActivity");
        Bundle bundle = new Bundle();
        addArgumentsToBundle$inquiry_dynamic_feature_release(bundle);
        intent.replaceExtras(bundle);
        return intent;
    }

    public final void addArgumentsToBundle$inquiry_dynamic_feature_release(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str = this.templateId;
        if (str != null) {
            bundle.putString("TEMPLATE_ID_KEY", str);
        }
        String str2 = this.templateVersion;
        if (str2 != null) {
            bundle.putString("TEMPLATE_VERSION_KEY", str2);
        }
        String str3 = this.inquiryId;
        if (str3 != null) {
            bundle.putString("INQUIRY_ID_KEY", str3);
        }
        String str4 = this.oneTimeLinkCode;
        if (str4 != null) {
            bundle.putString("ONE_TIME_LINK_CODE", str4);
        }
        String str5 = this.sessionToken;
        if (str5 != null) {
            bundle.putString("SESSION_TOKEN_KEY", str5);
        }
        String str6 = this.referenceId;
        if (str6 != null) {
            bundle.putString("REFERENCE_ID_KEY", str6);
        }
        String str7 = this.accountId;
        if (str7 != null) {
            bundle.putString("ACCOUNT_ID_KEY", str7);
        }
        Fields fields = this.fields;
        if (fields != null) {
            bundle.putParcelable("FIELDS_MAP_KEY", new InquiryFieldsMap(fields.getFields$inquiry_dynamic_feature_release()));
        }
        Integer num = this.theme;
        if (num != null) {
            bundle.putInt("THEME_KEY", num.intValue());
        }
        StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
        if (staticInquiryTemplate != null) {
            bundle.putParcelable("STATIC_INQUIRY_TEMPLATE_KEY", staticInquiryTemplate);
        }
        Environment environment = this.environment;
        if (environment != null) {
            bundle.putString("ENVIRONMENT_KEY", environment.name());
        }
        String str8 = this.environmentId;
        if (str8 != null) {
            bundle.putString("ENVIRONMENT_ID_KEY", str8);
        }
        Boolean bool = this.enableErrorLogging;
        if (bool != null) {
            bundle.putBoolean("ENABLE_ERROR_LOGGING", bool.booleanValue());
        }
        Boolean bool2 = this.returnCollectedData;
        if (bool2 != null) {
            bundle.putBoolean("RETURN_COLLECTED_DATA", bool2.booleanValue());
        }
        FallbackMode fallbackMode = this.fallbackMode;
        if (fallbackMode != null) {
            bundle.putString("FALLBACK_MODE", fallbackMode.name());
        }
        Boolean bool3 = this.useServerStyles;
        if (bool3 != null) {
            bundle.putBoolean("USE_SERVER_STYLES", bool3.booleanValue());
        }
        String str9 = this.themeSetId;
        if (str9 != null) {
            bundle.putString("THEME_SET_ID_KEY", str9);
        }
        String str10 = this.locale;
        if (str10 != null) {
            bundle.putString("LOCALE", str10);
        }
        Boolean bool4 = this.consumeExceptions;
        if (bool4 != null) {
            bundle.putBoolean("CONSUME_EXCEPTIONS", bool4.booleanValue());
        }
    }

    /* compiled from: Inquiry.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Contract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "<init>", "()V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createIntent", "Landroid/content/Intent;", "input", "parseResult", "resultCode", "", "intent", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static class Contract extends ActivityResultContract<Inquiry, InquiryResponse> {
        private Context context;

        @Deprecated
        public Contract() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Contract(Context context) {
            this();
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Inquiry input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input.toInquiryActivityIntent(context);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public InquiryResponse parseResult(int resultCode, Intent intent) {
            return Inquiry.INSTANCE.onActivityResult(intent, this.context);
        }
    }

    /* compiled from: Inquiry.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0007J\u001e\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u001c\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0018\u0010\u001e\u001a\u00020\u001f*\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;", "", "<init>", "()V", "fromTemplate", "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "templateId", "", "fromTemplateVersion", "templateVersion", "fromStaticTemplate", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "fromInquiry", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "inquiryId", "fromOneTimeLinkCode", "oneTimeLinkCode", "onActivityResult", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extractInquiryResponseFromBundle", "bundle", "Landroid/os/Bundle;", "prefetchModels", "", "cancelRunningInquiries", "getStatus", "Lcom/withpersona/sdk2/inquiry/internal/InquiryIntentKeys$Status;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* compiled from: Inquiry.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InquiryIntentKeys.values().length];
                try {
                    iArr[InquiryIntentKeys.INQUIRY_COMPLETE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InquiryIntentKeys.INQUIRY_CANCELED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InquiryIntentKeys.INQUIRY_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        @JvmStatic
        @JvmOverloads
        public final InquiryResponse onActivityResult(Intent intent) {
            return onActivityResult$default(this, intent, null, 2, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final InquiryTemplateBuilder fromTemplate(String templateId) {
            Intrinsics.checkNotNullParameter(templateId, "templateId");
            return new InquiryTemplateBuilder(templateId, null, null, 6, null);
        }

        @JvmStatic
        public final InquiryTemplateBuilder fromTemplateVersion(String templateVersion) {
            Intrinsics.checkNotNullParameter(templateVersion, "templateVersion");
            return new InquiryTemplateBuilder(null, templateVersion, null, 5, null);
        }

        @JvmStatic
        @ExperimentalInquiryFlow
        public final InquiryTemplateBuilder fromStaticTemplate(StaticInquiryTemplate staticInquiryTemplate) {
            Intrinsics.checkNotNullParameter(staticInquiryTemplate, "staticInquiryTemplate");
            return new InquiryTemplateBuilder(null, null, staticInquiryTemplate, 3, null);
        }

        @JvmStatic
        public final InquiryBuilder fromInquiry(String inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return InquiryBuilder.INSTANCE.fromInquiryId$inquiry_dynamic_feature_release(inquiryId);
        }

        @JvmStatic
        public final InquiryBuilder fromOneTimeLinkCode(String oneTimeLinkCode) {
            Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
            return InquiryBuilder.INSTANCE.fromOneTimeLinkCode$inquiry_dynamic_feature_release(oneTimeLinkCode);
        }

        public static /* synthetic */ InquiryResponse onActivityResult$default(Companion companion, Intent intent, Context context, int i, Object obj) {
            if ((i & 2) != 0) {
                context = null;
            }
            return companion.onActivityResult(intent, context);
        }

        @Deprecated
        @JvmStatic
        @JvmOverloads
        public final InquiryResponse onActivityResult(Intent intent, Context context) {
            return extractInquiryResponseFromBundle(intent != null ? intent.getExtras() : null, context);
        }

        @JvmStatic
        public final InquiryResponse extractInquiryResponseFromBundle(Bundle bundle, Context context) {
            InquiryFieldsMap inquiryFieldsMap;
            Object unknownField;
            Object dateField;
            ErrorCode errorCode;
            ErrorCode errorCode2;
            InquiryIntentKeys status = getStatus(bundle, context);
            String string2 = bundle != null ? bundle.getString("INQUIRY_ID_KEY") : null;
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new InquiryResponse.Cancel(string2, bundle != null ? bundle.getString("SESSION_TOKEN_KEY") : null);
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                String string3 = bundle != null ? bundle.getString("ERROR_DEBUG_MESSAGE_KEY") : null;
                String lastErrorMessage = context != null ? new ExceptionLogger(context).getLastErrorMessage() : null;
                if (bundle != null) {
                    try {
                        errorCode = (ErrorCode) bundle.getParcelable("ERROR_CODE_KEY");
                    } catch (Exception unused) {
                        errorCode2 = ErrorCode.UnexpectedError;
                    }
                } else {
                    errorCode = null;
                }
                ErrorCode errorCode3 = errorCode != null ? errorCode : null;
                if (errorCode3 == null) {
                    errorCode3 = ErrorCode.UnexpectedError;
                }
                errorCode2 = errorCode3;
                if (string3 == null) {
                    string3 = "An otherwise unexpected error occurred.";
                }
                return new InquiryResponse.Error(string3, errorCode2, lastErrorMessage);
            }
            if (bundle == null || (inquiryFieldsMap = (InquiryFieldsMap) BundleCompat.getParcelable(bundle, "FIELDS_MAP_KEY", InquiryFieldsMap.class)) == null) {
                inquiryFieldsMap = new InquiryFieldsMap(MapsKt.emptyMap());
            }
            String string4 = bundle != null ? bundle.getString("INQUIRY_STATUS_KEY") : null;
            CollectedData collectedData = bundle != null ? (CollectedData) BundleCompat.getParcelable(bundle, "COLLECTED_DATA", CollectedData.class) : null;
            Intrinsics.checkNotNull(string2);
            Intrinsics.checkNotNull(string4);
            Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> fields = inquiryFieldsMap.getFields();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(fields.size()));
            Iterator<T> it = fields.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                com.withpersona.sdk2.inquiry.network.dto.InquiryField inquiryField = (com.withpersona.sdk2.inquiry.network.dto.InquiryField) entry.getValue();
                if (inquiryField instanceof InquiryField.StringField) {
                    unknownField = new InquiryField.StringField(((InquiryField.StringField) inquiryField).getValue());
                } else if (inquiryField instanceof InquiryField.IntegerField) {
                    unknownField = new InquiryField.IntegerField(((InquiryField.IntegerField) inquiryField).getValue());
                } else if (inquiryField instanceof InquiryField.BooleanField) {
                    unknownField = new InquiryField.BooleanField(((InquiryField.BooleanField) inquiryField).getValue());
                } else if (inquiryField instanceof InquiryField.FloatField) {
                    unknownField = new InquiryField.FloatField(((InquiryField.FloatField) inquiryField).getValue());
                } else if (inquiryField instanceof InquiryField.DateField) {
                    String value = ((InquiryField.DateField) inquiryField).getValue();
                    if (value != null) {
                        dateField = new InquiryField.DateField(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(value));
                        unknownField = dateField;
                    } else {
                        unknownField = new InquiryField.DateField(null);
                    }
                } else if (inquiryField instanceof InquiryField.DatetimeField) {
                    String value2 = ((InquiryField.DatetimeField) inquiryField).getValue();
                    if (value2 != null) {
                        dateField = new InquiryField.DateField(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(value2));
                        unknownField = dateField;
                    } else {
                        unknownField = new InquiryField.DatetimeField(null);
                    }
                } else if (inquiryField instanceof InquiryField.ChoicesField) {
                    unknownField = new InquiryField.ChoicesField(((InquiryField.ChoicesField) inquiryField).getValue());
                } else if (inquiryField instanceof InquiryField.MultiChoicesField) {
                    unknownField = new InquiryField.MultiChoicesField(((InquiryField.MultiChoicesField) inquiryField).getValue());
                } else {
                    if (!(inquiryField instanceof InquiryField.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    unknownField = new InquiryField.UnknownField(((InquiryField.Unknown) inquiryField).getType());
                }
                linkedHashMap.put(key, unknownField);
            }
            return new InquiryResponse.Complete(string2, string4, linkedHashMap, collectedData);
        }

        public final void prefetchModels() throws IllegalAccessException, InstantiationException {
            Prefetching.INSTANCE.prefetchModels();
        }

        public final void cancelRunningInquiries() {
            InquiryActivityBroadcastManager.INSTANCE.cancelRunningInquiries();
        }

        private final InquiryIntentKeys getStatus(Bundle bundle, Context context) {
            String string2;
            InquiryIntentKeys inquiryIntentKeysValueOf = null;
            if (bundle != null && (string2 = bundle.getString("PERSONA_ACTIVITY_RESULT")) != null) {
                try {
                    inquiryIntentKeysValueOf = InquiryIntentKeys.valueOf(string2);
                } catch (Exception unused) {
                }
            }
            if (inquiryIntentKeysValueOf != null) {
                return inquiryIntentKeysValueOf;
            }
            if (context == null) {
                return InquiryIntentKeys.INQUIRY_CANCELED;
            }
            if (new ExceptionLogger(context).hasLastErrorMessage()) {
                return InquiryIntentKeys.INQUIRY_ERROR;
            }
            return InquiryIntentKeys.INQUIRY_CANCELED;
        }
    }
}
