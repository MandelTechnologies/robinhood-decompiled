package com.android.shared.portfolio.lists.handler;

import androidx.fragment.app.DialogFragment;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;

/* compiled from: ListsAlertPromptHandler.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/android/shared/portfolio/lists/handler/ListsAlertPromptHandler;", "", "createAlertPromptBottomSheet", "Landroidx/fragment/app/DialogFragment;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "onAlertPromptBottomSheetShown", "", "lib-lists-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface ListsAlertPromptHandler {
    DialogFragment createAlertPromptBottomSheet(Navigator navigator);

    void onAlertPromptBottomSheetShown();
}
