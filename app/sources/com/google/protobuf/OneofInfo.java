package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes27.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id */
    private final int f949id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int id, java.lang.reflect.Field caseField, java.lang.reflect.Field valueField) {
        this.f949id = id;
        this.caseField = caseField;
        this.valueField = valueField;
    }

    public int getId() {
        return this.f949id;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
