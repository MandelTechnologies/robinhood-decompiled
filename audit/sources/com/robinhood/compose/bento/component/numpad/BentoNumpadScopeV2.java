package com.robinhood.compose.bento.component.numpad;

import android.view.KeyEvent;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: BentoNumpadScopeV2.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH&J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH&R \u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "", "keyPressEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "getKeyPressEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "getInternalValue", "Landroidx/compose/runtime/MutableState;", "", "key", "initialValue", "setInternalValue", "", "value", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface BentoNumpadScopeV2 {
    CoroutineScope getCoroutineScope();

    SnapshotState<String> getInternalValue(String key, String initialValue);

    Flow<KeyEvent> getKeyPressEventFlow();

    void setInternalValue(String key, String value);
}
