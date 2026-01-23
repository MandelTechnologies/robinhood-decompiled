package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.EdgeToEdge;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2InquiryActivityBinding;
import com.withpersona.sdk2.inquiry.internal.error_reporting.ExceptionUtils3;
import com.withpersona.sdk2.inquiry.shared.utils.SplitUtils;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InquiryActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "args", "Lcom/withpersona/sdk2/inquiry/internal/InquiryArguments;", "getArgs", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryArguments;", "args$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/withpersona/sdk2/inquiry/internal/InquiryViewModel;", "getViewModel", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryViewModel;", "viewModel$delegate", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "runActivity", "onPause", "onDestroy", "validateArgumentsOrFinish", "", "onResume", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class InquiryActivity extends AppCompatActivity {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InquiryActivity.args_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public InquiryActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(InquiryViewModel.class), new Function0<ViewModelStore>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InquiryArguments args_delegate$lambda$0(InquiryActivity inquiryActivity) {
        return new InquiryArguments(inquiryActivity.getIntent().getExtras());
    }

    private final InquiryArguments getArgs() {
        return (InquiryArguments) this.args.getValue();
    }

    private final InquiryViewModel getViewModel() {
        return (InquiryViewModel) this.viewModel.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        SplitUtils.installSplitApkIfNeeded(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Exception {
        EdgeToEdge.enable$default(this, null, null, 3, null);
        super.onCreate(savedInstanceState);
        try {
            runActivity(savedInstanceState);
        } catch (Exception e) {
            if (getArgs().getConsumeExceptions()) {
                if (getArgs().getEnableErrorLogging()) {
                    ExceptionUtils3.getErrorHandler(this).recordError(e);
                }
                Intent intent = new Intent();
                intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
                intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
                ErrorCode errorCode = ErrorCode.ExceptionError;
                Intrinsics.checkNotNull(errorCode, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("ERROR_CODE_KEY", (Parcelable) errorCode);
                Unit unit = Unit.INSTANCE;
                setResult(0, intent);
                finish();
                return;
            }
            throw e;
        }
    }

    private final void runActivity(Bundle savedInstanceState) {
        if (validateArgumentsOrFinish()) {
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
            intent.putExtra("INQUIRY_ID_KEY", getArgs().getInquiryId());
            String sessionToken = getArgs().getSessionToken();
            intent.putExtra("SESSION_TOKEN_KEY", sessionToken != null ? InquiryArguments.INSTANCE.removeBearer(sessionToken) : null);
            Unit unit = Unit.INSTANCE;
            setResult(0, intent);
            Integer theme = getArgs().getTheme();
            if (theme != null) {
                setTheme(theme.intValue());
            }
            Pi2InquiryActivityBinding pi2InquiryActivityBindingInflate = Pi2InquiryActivityBinding.inflate(LayoutInflater.from(this));
            Intrinsics.checkNotNullExpressionValue(pi2InquiryActivityBindingInflate, "inflate(...)");
            setContentView(pi2InquiryActivityBindingInflate.getRoot());
            if (savedInstanceState == null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                int i = R$id.fragment_content;
                InquiryFragment inquiryFragment = new InquiryFragment();
                inquiryFragment.setArguments(getIntent().getExtras());
                fragmentTransactionBeginTransaction.replace(i, inquiryFragment);
                fragmentTransactionBeginTransaction.commit();
            }
            getSupportFragmentManager().setFragmentResultListener(getArgs().getRequestKey(), this, new FragmentResultListener() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryActivity$$ExternalSyntheticLambda1
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(String str, Bundle bundle) {
                    InquiryActivity.runActivity$lambda$7(this.f$0, str, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runActivity$lambda$7(InquiryActivity inquiryActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        Unit unit = Unit.INSTANCE;
        inquiryActivity.setResult(-1, intent);
        inquiryActivity.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (isFinishing()) {
            ExceptionUtils3.unregisterExceptionHandler(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getViewModel().onDestroy();
    }

    private final boolean validateArgumentsOrFinish() {
        String sessionToken = getArgs().getSessionToken();
        if (sessionToken == null || !StringsKt.contains$default((CharSequence) sessionToken, '\n', false, 2, (Object) null)) {
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        ErrorCode errorCode = ErrorCode.SessionTokenError;
        Intrinsics.checkNotNull(errorCode, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("ERROR_CODE_KEY", (Parcelable) errorCode);
        Unit unit = Unit.INSTANCE;
        setResult(0, intent);
        finish();
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getViewModel().refreshAppSetId();
    }
}
