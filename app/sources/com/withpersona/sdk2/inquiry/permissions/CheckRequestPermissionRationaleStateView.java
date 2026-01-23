package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import com.squareup.workflow1.p415ui.AndroidViewRendering;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2CheckRequestPermissionRationaleStateBinding;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CheckRequestPermissionRationaleStateView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B>\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R1\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/CheckRequestPermissionRationaleStateView;", "Lcom/squareup/workflow1/ui/AndroidViewRendering;", "Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "permission", "", "isPermanentPermissionRejectionCheck", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "shouldShowRationale", "", "callback", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/Permission;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "Z", "Lkotlin/jvm/functions/Function1;", "Lcom/squareup/workflow1/ui/ViewFactory;", "viewFactory", "Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory", "()Lcom/squareup/workflow1/ui/ViewFactory;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class CheckRequestPermissionRationaleStateView implements AndroidViewRendering<CheckRequestPermissionRationaleStateView> {
    private final Function1<Boolean, Unit> callback;
    private final boolean isPermanentPermissionRejectionCheck;
    private final PermissionsState permission;
    private final ViewFactory<CheckRequestPermissionRationaleStateView> viewFactory;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckRequestPermissionRationaleStateView)) {
            return false;
        }
        CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = (CheckRequestPermissionRationaleStateView) other;
        return this.permission == checkRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == checkRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && Intrinsics.areEqual(this.callback, checkRequestPermissionRationaleStateView.callback);
    }

    public int hashCode() {
        int iHashCode = ((this.permission.hashCode() * 31) + Boolean.hashCode(this.isPermanentPermissionRejectionCheck)) * 31;
        Function1<Boolean, Unit> function1 = this.callback;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public String toString() {
        return "CheckRequestPermissionRationaleStateView(permission=" + this.permission + ", isPermanentPermissionRejectionCheck=" + this.isPermanentPermissionRejectionCheck + ", callback=" + this.callback + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckRequestPermissionRationaleStateView(PermissionsState permission, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.permission = permission;
        this.isPermanentPermissionRejectionCheck = z;
        this.callback = function1;
        LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
        this.viewFactory = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(CheckRequestPermissionRationaleStateView.class), CheckRequestPermissionRationaleStateView2.INSTANCE, new Function1<Pi2CheckRequestPermissionRationaleStateBinding, LayoutRunner<CheckRequestPermissionRationaleStateView>>() { // from class: com.withpersona.sdk2.inquiry.permissions.CheckRequestPermissionRationaleStateView$special$$inlined$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final LayoutRunner<CheckRequestPermissionRationaleStateView> invoke(final Pi2CheckRequestPermissionRationaleStateBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                final CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = this.this$0;
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.permissions.CheckRequestPermissionRationaleStateView$special$$inlined$bind$1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.squareup.workflow1.p415ui.LayoutRunner
                    public final void showRendering(RenderingT rendering, ViewEnvironment viewEnvironment) {
                        Intrinsics.checkNotNullParameter(rendering, "rendering");
                        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                        final CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView2 = (CheckRequestPermissionRationaleStateView) rendering;
                        final Pi2CheckRequestPermissionRationaleStateBinding pi2CheckRequestPermissionRationaleStateBinding = (Pi2CheckRequestPermissionRationaleStateBinding) binding;
                        Context context = pi2CheckRequestPermissionRationaleStateBinding.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        final AppCompatActivity appCompatActivityRequireActivity = ContextUtils3.requireActivity(context);
                        if (checkRequestPermissionRationaleStateView2.callback != null) {
                            View root = pi2CheckRequestPermissionRationaleStateBinding.getRoot();
                            final CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView3 = checkRequestPermissionRationaleStateView;
                            root.post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.permissions.CheckRequestPermissionRationaleStateView$viewFactory$2$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (pi2CheckRequestPermissionRationaleStateBinding.getRoot().isAttachedToWindow()) {
                                        if (checkRequestPermissionRationaleStateView3.permission == PermissionsState.RecordAudio && !checkRequestPermissionRationaleStateView3.isPermanentPermissionRejectionCheck) {
                                            checkRequestPermissionRationaleStateView2.callback.invoke(Boolean.TRUE);
                                        } else {
                                            checkRequestPermissionRationaleStateView2.callback.invoke(Boolean.valueOf(ActivityCompat.shouldShowRequestPermissionRationale(appCompatActivityRequireActivity, PermissionsState4.toPermissionString(checkRequestPermissionRationaleStateView2.permission))));
                                        }
                                    }
                                }
                            });
                        }
                    }
                };
            }
        });
    }

    @Override // com.squareup.workflow1.p415ui.AndroidViewRendering
    public ViewFactory<CheckRequestPermissionRationaleStateView> getViewFactory() {
        return this.viewFactory;
    }
}
