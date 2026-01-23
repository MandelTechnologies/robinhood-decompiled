package com.plaid.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBindings;
import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.C5975U0;
import com.plaid.link.C7279R;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Lcom/plaid/internal/T0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.plaid.internal.T0 */
/* loaded from: classes16.dex */
public final class C5966T0 extends Fragment {

    /* renamed from: c */
    public static final /* synthetic */ int f1701c = 0;

    /* renamed from: a */
    public C7087g5 f1702a;

    /* renamed from: b */
    public C5975U0 f1703b;

    /* renamed from: com.plaid.internal.T0$a */
    public static final class a {
        /* renamed from: a */
        public static C5966T0 m1316a(AbstractC5894L2.i errorState) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            C5966T0 c5966t0 = new C5966T0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("error_state", errorState);
            c5966t0.setArguments(bundle);
            return c5966t0;
        }
    }

    /* renamed from: com.plaid.internal.T0$b */
    public static final class b implements ViewModelProvider.Factory {
        public b() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Resources resources = C5966T0.this.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return new C5975U0(resources);
        }
    }

    /* renamed from: a */
    public static final WindowInsetsCompat m1313a(View v, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        v.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: b */
    public static final void m1315b(C5966T0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requireActivity().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1703b = (C5975U0) new ViewModelProvider(this, new b()).get(C5975U0.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C7279R.layout.plaid_error_fragment, viewGroup, false);
        int i = C7279R.id.error_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, i);
        if (textView != null) {
            i = C7279R.id.error_header;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, i);
            if (textView2 != null) {
                i = C7279R.id.error_image;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, i)) != null) {
                    i = C7279R.id.exit_button;
                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(viewInflate, i);
                    if (appCompatButton != null) {
                        i = C7279R.id.plaid_close_icon;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, i)) != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            i = C7279R.id.plaid_navigation;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i);
                            if (linearLayout2 != null) {
                                C7087g5 c7087g5 = new C7087g5(linearLayout, textView, textView2, appCompatButton, linearLayout, linearLayout2);
                                Intrinsics.checkNotNullExpressionValue(c7087g5, "inflate(...)");
                                this.f1702a = c7087g5;
                                ViewCompat.setOnApplyWindowInsetsListener(linearLayout, new OnApplyWindowInsetsListener() { // from class: com.plaid.internal.T0$$ExternalSyntheticLambda0
                                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                                        return C5966T0.m1313a(view, windowInsetsCompat);
                                    }
                                });
                                C7087g5 c7087g52 = this.f1702a;
                                if (c7087g52 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    c7087g52 = null;
                                }
                                LinearLayout linearLayout3 = c7087g52.f2803a;
                                Intrinsics.checkNotNullExpressionValue(linearLayout3, "getRoot(...)");
                                return linearLayout3;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        AbstractC5894L2.i state;
        C5975U0.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C7087g5 c7087g5 = this.f1702a;
        C7087g5 c7087g52 = null;
        if (c7087g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c7087g5 = null;
        }
        c7087g5.f2807e.findViewById(C7279R.id.plaid_close_icon).setOnClickListener(new View.OnClickListener() { // from class: com.plaid.internal.T0$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5966T0.m1314a(this.f$0, view2);
            }
        });
        C7087g5 c7087g53 = this.f1702a;
        if (c7087g53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c7087g53 = null;
        }
        c7087g53.f2806d.setOnClickListener(new View.OnClickListener() { // from class: com.plaid.internal.T0$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5966T0.m1315b(this.f$0, view2);
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null || (state = (AbstractC5894L2.i) arguments.getParcelable("error_state")) == null) {
            Log.e("ErrorFragment", "No error state provided, using default UNKNOWN_ERROR state");
            C6009X7.CREATOR.getClass();
            state = new AbstractC5894L2.i("", C6009X7.f1833e, "", "", "", CollectionsKt.emptyList(), "", EnumC5805B3.UNKNOWN_ERROR);
        }
        Intrinsics.checkNotNull(state);
        C5975U0 c5975u0 = this.f1703b;
        if (c5975u0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            c5975u0 = null;
        }
        c5975u0.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        int i = C5975U0.b.f1739a[state.f1487i.ordinal()];
        if (i == 1) {
            String string2 = c5975u0.f1735a.getString(C7279R.string.plaid_error_no_network_connection_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = c5975u0.f1735a.getString(C7279R.string.plaid_error_no_network_connection_content);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = c5975u0.f1735a.getString(C7279R.string.plaid_error_no_network_connection_exit);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            aVar = new C5975U0.a(string2, string3, string4);
        } else if (i == 2) {
            String string5 = c5975u0.f1735a.getString(C7279R.string.plaid_error_session_expired_title);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = c5975u0.f1735a.getString(C7279R.string.plaid_error_session_expired_content);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            String string7 = c5975u0.f1735a.getString(C7279R.string.plaid_error_session_expired_exit);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            aVar = new C5975U0.a(string5, string6, string7);
        } else if (i == 3) {
            String string8 = c5975u0.f1735a.getString(C7279R.string.plaid_error_initialization_header);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            String string9 = c5975u0.f1735a.getString(C7279R.string.plaid_error_initialization_content);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            String string10 = c5975u0.f1735a.getString(C7279R.string.plaid_error_initialization_button_text);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            aVar = new C5975U0.a(string8, string9, string10);
        } else if (i == 4) {
            String string11 = c5975u0.f1735a.getString(C7279R.string.plaid_error_internal_server_error_something_went_wrong);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            String string12 = c5975u0.f1735a.getString(C7279R.string.plaid_error_internal_server_error_try_again_later);
            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
            String string13 = c5975u0.f1735a.getString(C7279R.string.plaid_error_internal_error_exit);
            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
            aVar = new C5975U0.a(string11, string12, string13);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String string14 = c5975u0.f1735a.getString(C7279R.string.plaid_error_fallback_header);
            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
            String string15 = c5975u0.f1735a.getString(C7279R.string.plaid_error_fallback_content);
            Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
            String string16 = c5975u0.f1735a.getString(C7279R.string.plaid_error_fallback_button_text);
            Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
            aVar = new C5975U0.a(string14, string15, string16);
        }
        C7087g5 c7087g54 = this.f1702a;
        if (c7087g54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c7087g54 = null;
        }
        c7087g54.f2805c.setText(aVar.f1736a);
        C7087g5 c7087g55 = this.f1702a;
        if (c7087g55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c7087g55 = null;
        }
        c7087g55.f2804b.setText(aVar.f1737b);
        C7087g5 c7087g56 = this.f1702a;
        if (c7087g56 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c7087g52 = c7087g56;
        }
        c7087g52.f2806d.setText(aVar.f1738c);
    }

    /* renamed from: a */
    public static final void m1314a(C5966T0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requireActivity().onBackPressed();
    }
}
