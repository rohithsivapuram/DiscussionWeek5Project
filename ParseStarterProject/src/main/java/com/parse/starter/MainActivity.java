/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.ParseAnalytics;
import com.parse.ParseObject;


public class MainActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ParseAnalytics.trackAppOpenedInBackground(getIntent());
    ParseObject.registerSubclass(Employee.class);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  public void submit(View button) {
    final EditText nameField = (EditText) findViewById(R.id.EditTextName);
    String name = nameField.getText().toString();
    final EditText emailField = (EditText) findViewById(R.id.EditTextEmail);
    String email = emailField.getText().toString();
    final EditText phoneField = (EditText) findViewById(R.id.EditTextPhone);
    String phone = phoneField.getText().toString();
    final EditText addressField = (EditText) findViewById(R.id.EditTextAddress);
    String address = addressField.getText().toString();
    final EditText employeeId = (EditText) findViewById(R.id.EditTextId);
    String employmentId = employeeId.getText().toString();
    Employee employee = new Employee();
    employee.setName(name);
    employee.setEmail(email);
    employee.setPhone(phone);
    employee.setAddress(address);
    employee.setEmployeeId(employmentId);
    employee.saveEventually();
    Intent output = new Intent();
    setResult(RESULT_OK, output);
    finish();
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
