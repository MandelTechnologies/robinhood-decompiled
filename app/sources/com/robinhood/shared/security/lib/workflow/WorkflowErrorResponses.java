package com.robinhood.shared.security.lib.workflow;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.utils.Json2;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: WorkflowErrorResponses.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0002\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u0005H\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u000b\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"errorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse;", "extractErrorResponse", "", "Lretrofit2/Response;", "handleWorkflowError", "", "Landroidx/fragment/app/FragmentActivity;", "t", "dialogId", "", "lib-workflow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.lib.workflow.WorkflowErrorResponsesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class WorkflowErrorResponses {
    private static final JsonAdapter<WorkflowErrorResponse> errorResponseAdapter;

    static {
        LazyMoshi lazyMoshi = new LazyMoshi(new Lazy() { // from class: com.robinhood.shared.security.lib.workflow.WorkflowErrorResponsesKt$errorResponseAdapter$1
            @Override // dagger.Lazy
            public final Moshi get() {
                Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
                Json2.addGenericAdapters$default(builderAdd, null, 1, null);
                builderAdd.add((JsonAdapter.Factory) WorkflowErrorResponse.INSTANCE.getJsonAdapterFactory());
                Moshi moshiBuild = builderAdd.build();
                Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
                return moshiBuild;
            }
        });
        Types types = Types.INSTANCE;
        errorResponseAdapter = lazyMoshi.adapter(new TypeToken<WorkflowErrorResponse>() { // from class: com.robinhood.shared.security.lib.workflow.WorkflowErrorResponsesKt$special$$inlined$getAdapter$1
        }.getType());
    }

    private static final WorkflowErrorResponse extractErrorResponse(Response<?> response) {
        try {
            String strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response);
            if (strExtractErrorBodyString != null) {
                return errorResponseAdapter.fromJson(strExtractErrorBodyString);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    private static final WorkflowErrorResponse extractErrorResponse(Throwable th) {
        Response<?> response;
        HttpException httpException = (HttpException) Throwables.findCause(th, HttpException.class);
        if (httpException == null || (response = httpException.response()) == null) {
            return null;
        }
        return extractErrorResponse(response);
    }

    public static /* synthetic */ void handleWorkflowError$default(FragmentActivity fragmentActivity, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C11048R.id.dialog_id_generic_error;
        }
        handleWorkflowError(fragmentActivity, th, i);
    }

    public static final void handleWorkflowError(FragmentActivity fragmentActivity, Throwable t, int i) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
        WorkflowErrorResponse workflowErrorResponseExtractErrorResponse = extractErrorResponse(t);
        if (workflowErrorResponseExtractErrorResponse != null) {
            RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(fragmentActivity).setUseDesignSystemOverlay(true).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(workflowErrorResponseExtractErrorResponse.getMessage()).setId(i);
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(id, supportFragmentManager, "workflowError", false, 4, null);
            return;
        }
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, fragmentActivity, t, true, false, i, null, 40, null);
    }
}
