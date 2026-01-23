package com.robinhood.android.educationtour;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeEducationTourScreen.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B4\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J$\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/educationtour/ComposeEducationTourScreen;", "", "screenName", "", "onFocus", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "elementId", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getScreenName", "()Ljava/lang/String;", "getOnFocus", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ComposeEducationTourScreen {
    public static final int $stable = 0;
    private final Function1<String, Unit> onFocus;
    private final String screenName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposeEducationTourScreen copy$default(ComposeEducationTourScreen composeEducationTourScreen, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = composeEducationTourScreen.screenName;
        }
        if ((i & 2) != 0) {
            function1 = composeEducationTourScreen.onFocus;
        }
        return composeEducationTourScreen.copy(str, function1);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    public final Function1<String, Unit> component2() {
        return this.onFocus;
    }

    public final ComposeEducationTourScreen copy(String screenName, Function1<? super String, Unit> onFocus) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(onFocus, "onFocus");
        return new ComposeEducationTourScreen(screenName, onFocus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeEducationTourScreen)) {
            return false;
        }
        ComposeEducationTourScreen composeEducationTourScreen = (ComposeEducationTourScreen) other;
        return Intrinsics.areEqual(this.screenName, composeEducationTourScreen.screenName) && Intrinsics.areEqual(this.onFocus, composeEducationTourScreen.onFocus);
    }

    public int hashCode() {
        return (this.screenName.hashCode() * 31) + this.onFocus.hashCode();
    }

    public String toString() {
        return "ComposeEducationTourScreen(screenName=" + this.screenName + ", onFocus=" + this.onFocus + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeEducationTourScreen(String screenName, Function1<? super String, Unit> onFocus) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(onFocus, "onFocus");
        this.screenName = screenName;
        this.onFocus = onFocus;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public /* synthetic */ ComposeEducationTourScreen(String str, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Function1() { // from class: com.robinhood.android.educationtour.ComposeEducationTourScreen$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposeEducationTourScreen._init_$lambda$0((String) obj);
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnFocus() {
        return this.onFocus;
    }
}
