package com.robinhood.compose.app.composeNavigation;

import androidx.view.OnBackPressedDispatcher;
import com.robinhood.compose.app.GenericComposeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseComposeNavHostFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"handleBackPressForComposeNavHostFragment", "", "Lcom/robinhood/compose/app/GenericComposeFragment;", "lib-compose-app_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragmentKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BaseComposeNavHostFragment2 {
    public static final boolean handleBackPressForComposeNavHostFragment(GenericComposeFragment genericComposeFragment) {
        Intrinsics.checkNotNullParameter(genericComposeFragment, "<this>");
        OnBackPressedDispatcher onBackPressedDispatcher = genericComposeFragment.requireActivity().getOnBackPressedDispatcher();
        if (!onBackPressedDispatcher.getHasEnabledCallbacks()) {
            return false;
        }
        onBackPressedDispatcher.onBackPressed();
        return true;
    }
}
