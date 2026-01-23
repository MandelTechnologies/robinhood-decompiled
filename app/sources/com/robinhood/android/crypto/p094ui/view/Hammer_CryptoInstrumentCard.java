package com.robinhood.android.crypto.p094ui.view;

import android.content.Context;
import com.robinhood.android.carousel.InstrumentCard;
import com.robinhood.hammer.android.view.ViewComponentManager;
import com.robinhood.hammer.android.view.ViewComponentManagerHolder;
import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_CryptoInstrumentCard.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b1\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB%\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fB-\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/Hammer_CryptoInstrumentCard;", "T", "", "Lcom/robinhood/android/carousel/InstrumentCard;", "Lcom/robinhood/hammer/android/view/ViewComponentManagerHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cardButtonGroupTitle", "", "cardButtonTitle", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "layoutRes", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/view/ViewComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/view/ViewComponentManager;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes2.dex */
public abstract class Hammer_CryptoInstrumentCard<T> extends InstrumentCard<T> implements ViewComponentManagerHolder {
    public static final int $stable = 8;
    private final ViewComponentManager componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_CryptoInstrumentCard(Context context, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, i);
    }

    public /* synthetic */ Hammer_CryptoInstrumentCard(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    public /* synthetic */ Hammer_CryptoInstrumentCard(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public /* bridge */ /* synthetic */ ComponentManager getComponentManager() {
        return this.componentManager;
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final ViewComponentManager getComponentManager() {
        return this.componentManager;
    }

    private Hammer_CryptoInstrumentCard(Context context) {
        super(context);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_CryptoInstrumentCard2 hammer_CryptoInstrumentCard2 = (Hammer_CryptoInstrumentCard2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.crypto.ui.view.CryptoInstrumentCard");
        hammer_CryptoInstrumentCard2.inject((CryptoInstrumentCard) this);
        this.injected = true;
    }

    private Hammer_CryptoInstrumentCard(Context context, String str, String str2) {
        super(context, str, str2);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_CryptoInstrumentCard2 hammer_CryptoInstrumentCard2 = (Hammer_CryptoInstrumentCard2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.crypto.ui.view.CryptoInstrumentCard");
        hammer_CryptoInstrumentCard2.inject((CryptoInstrumentCard) this);
        this.injected = true;
    }

    private Hammer_CryptoInstrumentCard(Context context, String str, String str2, int i) {
        super(context, str, str2, i);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_CryptoInstrumentCard2 hammer_CryptoInstrumentCard2 = (Hammer_CryptoInstrumentCard2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.crypto.ui.view.CryptoInstrumentCard");
        hammer_CryptoInstrumentCard2.inject((CryptoInstrumentCard) this);
        this.injected = true;
    }
}
