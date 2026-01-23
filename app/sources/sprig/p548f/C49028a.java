package sprig.p548f;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.singular.sdk.internal.Constants;
import com.userleap.R$id;
import com.userleap.R$layout;
import com.userleap.R$style;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import sprig.graphics.C48999g;

@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m3636d2 = {"Lsprig/f/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "getTheme", "view", "", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "onDestroyView", "Landroid/app/Dialog;", "onCreateDialog", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()Landroid/view/ViewGroup;", "webView", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.f.a */
/* loaded from: classes28.dex */
public final class C49028a extends BottomSheetDialogFragment {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, m3636d2 = {"Lsprig/f/a$a;", "", "Lsprig/f/a;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.f.a$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C49028a m4291a() {
            return new C49028a();
        }
    }

    @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.f.a$b */
    static final class b extends Lambda implements Function0<Unit> {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m4292a() {
            C49028a.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m4292a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    private final ViewGroup m4289a() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R$id.survey_web_view);
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment
    /* renamed from: getTheme */
    public int getThemeResId() {
        return R$style.userleap_bottom_sheet_dialog_theme;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext(), getThemeResId());
        bottomSheetDialog.setDismissWithAnimation(false);
        bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: sprig.f.a$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C49028a.m4290a(bottomSheetDialog, dialogInterface);
            }
        });
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.cloneInContext(new ContextThemeWrapper(getActivity(), R$style.userleap_theme)).inflate(R$layout.userleap_fragment_webview, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ViewGroup viewGroupM4289a = m4289a();
        if (viewGroupM4289a != null) {
            C48999g.f8243a.m4094a(viewGroupM4289a);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        C48999g.f8243a.m4105i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewGroup viewGroupM4289a = m4289a();
        if (viewGroupM4289a != null) {
            C48999g.f8243a.m4095a(viewGroupM4289a, new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4290a(BottomSheetDialog this_apply, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Window window = this_apply.getWindow();
        KeyEvent.Callback callbackFindViewById = window != null ? window.findViewById(R$id.design_bottom_sheet) : null;
        FrameLayout frameLayout = callbackFindViewById instanceof FrameLayout ? (FrameLayout) callbackFindViewById : null;
        if (frameLayout != null) {
            BottomSheetBehavior.from(frameLayout).setState(3);
        }
    }
}
