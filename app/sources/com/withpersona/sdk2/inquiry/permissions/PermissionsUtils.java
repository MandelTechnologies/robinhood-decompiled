package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PermissionsUtils.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0085\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00020\u00042\"\u0010\u0007\u001a\u001e0\u0005R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\r2$\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d0\u001b¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f*\u00020\u0004¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010%\u001a\u00020\b*\u00020$2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010&\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0'*\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'¢\u0006\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "context", "", "requestPermissions", "Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "permission", "optional", "", "title", "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "key", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "Lcom/squareup/workflow1/WorkflowAction;", "handler", "Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "withRequestPermissionsIfNeeded", "(Ljava/lang/Object;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;ZLcom/withpersona/sdk2/inquiry/permissions/Permission;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "toModalContainerScreen", "(Ljava/lang/Object;)Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "Landroid/content/Context;", "hasPermission", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/Permission;)Z", "", "permissions", "getMissingPermissions", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "permissions_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionsUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class PermissionsUtils {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <PropsT, StateT, OutputT, RenderingT> ModalContainerScreen<Object, Object> withRequestPermissionsIfNeeded(Object obj, StatefulWorkflow<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.RenderContext context, boolean z, PermissionsState permission, boolean z2, String title, String rationale, String rationaleWhenPermanentlyDenied, String str, String str2, String str3, String str4, String str5, PermissionRequestWorkflow permissionRequestWorkflow, StepStyles2 stepStyles2, String key, Function1<? super PermissionRequestWorkflow.Output, ? extends WorkflowAction<? super PropsT, StateT, ? extends OutputT>> handler) {
        ModalContainerScreen<Object, Object> modalContainerScreenFirstInModalStack;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        Intrinsics.checkNotNullParameter(rationaleWhenPermanentlyDenied, "rationaleWhenPermanentlyDenied");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (z) {
            Object objRenderChild = context.renderChild(permissionRequestWorkflow, new PermissionRequestWorkflow.Props(permission, z2, title, rationale, rationaleWhenPermanentlyDenied, str, str2, str3, str4, str5, stepStyles2), key, handler);
            return (objRenderChild == null || (modalContainerScreenFirstInModalStack = ModalContainerScreen2.firstInModalStack(objRenderChild, obj, "PermissionFlowModal")) == null) ? toModalContainerScreen(obj) : modalContainerScreenFirstInModalStack;
        }
        return toModalContainerScreen(obj);
    }

    public static final ModalContainerScreen<Object, Object> toModalContainerScreen(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return new ModalContainerScreen<>(obj, CollectionsKt.emptyList(), "PermissionFlowModal");
    }

    public static final boolean hasPermission(Context context, PermissionsState permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, PermissionsState4.toPermissionString(permission)) == 0;
    }

    public static final List<PermissionsState> getMissingPermissions(Context context, List<? extends PermissionsState> permissions) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (!hasPermission(context, (PermissionsState) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
